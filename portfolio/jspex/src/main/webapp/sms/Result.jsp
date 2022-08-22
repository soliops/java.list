<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%//@ page import="java.util.Date, java.io.*, java.util.*, java.net.*" %>
<%@ page import="java.security.MessageDigest" %>
<%@ page import="java.security.*" %>
<%!
// HASH 구현을 위한 클래스 파일생성
		public class CEncrypt
		{
				MessageDigest md;
				String strSRCData = "";
				String strENCData = "";

				public CEncrypt(){}
				//인스턴스 만들 때 한방에 처리할 수 있도록 생성자 중복시켰습니다.
				public CEncrypt(String EncMthd, String strData)
				{
						this.encrypt(EncMthd, strData);
				}

				//암호화 절차를 수행하는 메소드입니다.
				public void encrypt(String EncMthd, String strData)
			 {
					 try
					{
							MessageDigest md = MessageDigest.getInstance(EncMthd); // "MD5" or "SHA1"
						 byte[] bytData = strData.getBytes();
						 md.update(bytData);

						 byte[] digest = md.digest();
						 for(int i =0;i<digest.length;i++)
						 {
								 strENCData = strENCData + String.format("%02x",digest[i] & 0xFF).toLowerCase();
						 }
					 }catch(NoSuchAlgorithmException e)
					{
						 System.out.print("암호화 알고리즘이 없습니다.");
					};

					//나중에 원본 데이터가 필요할지 몰라서 저장해 둡니다.
					strSRCData = strData;
				}

				//접근자 인라인 함수(아니, 메소드)들입니다.
				public String getEncryptData(){return strENCData;}
				public String getSourceData(){return strSRCData;}

				//데이터가 같은지 비교해주는 메소드입니다.
				public boolean equal(String strData)
				{
					//암호화 데이터랑 비교를 하던, 원본이랑 비교를 하던 맘대로....
					if(strData == strENCData) return true;
					return false;
				}
		}    //CEncrypt

//전송결과 처리
//1 : 발송성공
//1~N : 콤마로 연결하여 다중 발송을 하였을 경우에는 성공한 정수 숫자로 리턴됩니다.
//0 : SMS발송 가능량 부족
//-1 : 잘못된 sms_id와 패스워드 입력
//     (sms_id와 패스워드를 다시 한번 확인해주시기 바랍니다.  sms_id,패스워드는 로그인때 id와 password가 아니며,
//      sms, LMS, MMS등의 서비스 신청시에 생성한 아이디와 패스워드입니다.)
//-2 : SMS 아이디 공백
//-3 : 발송 모두 실패
//      (수신자번호가 "숫자가 아닌 값"일시, 수신자번호 헨드폰 국번이 잘못된 값일시, 발송제한서버일시 값 반환)
//-4 : 해쉬공백
//-5 : 잘못된 sms_id와 패스워드 입력
//     (sms_id와 패스워드를 다시 한번 확인해주시기 바랍니다.  sms_id,패스워드는 로그인때 id와 password가 아니며,
//      sms, LMS, MMS등의 서비스 신청시에 생성한 아이디와 패스워드입니다.)
//- 6 : 수신자 전화번호 공백
//-8 : 발신자 전화번호 공백
//-9 : 전송내용 공백
//-10: 예약 날짜 이상
//      (예약발송일자가 YYMMDD 형식이 아닐 경우 반환)
//-11: 예약 시간 이상
//	   (예약시간이 hhmmss 형식이 아닐 경우 반환)
//-12: 예약 가능시간 지남
//      (예약 발송시간이 현재 시간보다 과거인지 확인 부탁드립니다.)
//-13: 스팸 동의서가 접수되지 않음
//-14: URL/MMS/LMS 서비스를 신청하지 않음
//- 15 : 서버에 이미지 파일 업로드 실패
//- 16 : 지원하지 않는 파일 확장자(MMS인 경우)
//-23: 허용ip가 아닌 경우 반환
//      (홈페이지 > 문자메세지 >서비스관리 > 서비스 신청내역 > 발송가능ip목록 내용을 확인해주시기 바랍니다.)
//- 21 : 데이터베이스 연결실패(DB Connection Fail), 잘못된 형태의 데이터를 보냈을 때
//-25: 주간 총 발송량 초과
//-26: 주간 URL 발송량 초과
//- 28 : 메세지에 발송제한 키워드 존재
//-27: 수/발신자 번호 동일
//-30: 등록되지 않은 발신번호 
//- 31 : 잘못된 발신번호
//- 40 : 스팸 발송 차단
//-50: 잘못된 전화번호
%>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="smsid" scope="session" class="test.ServiceSMSSoapProxy" />
<%
	if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
		smsid.setEndpoint(request.getParameter("endpoint"));
%>

<%
	String method = request.getParameter("method");
	String smsID = "";
	String hashValue = "";
	String hash_temp = "";
	String senderPhone = "";
	String receivePhone ="";
	String smsContent = "";
	String resultReturn = "";
	String reserveDate ="";
	String reserveTime = "";
	String userDefine = "";
	String callbackUrl = "";
	String searchValue = "";
	String mode = "";
	CEncrypt encrypt;

	int methodID = 0;
	if (method == null) methodID = -1;

	if(methodID != -1) methodID = Integer.parseInt(method);
	boolean gotMethod = false;

	try {
		switch (methodID){
		case 2:							//즉시보내기 사용예제
			gotMethod = true;
			smsID=  request.getParameter("smsID");
			hashValue = request.getParameter("hashValue");
			senderPhone =  request.getParameter("senderPhone");
			receivePhone =  request.getParameter("receivePhone");
			smsContent =  request.getParameter("smsContent");
			hash_temp = (smsID + hashValue + receivePhone); //아이디, 패스워드,수신번호를 hash화시킴

			encrypt = new CEncrypt("MD5", hash_temp);
			String sendSMS = smsid.sendSMS(smsID, encrypt.getEncryptData(), senderPhone, receivePhone, smsContent);

			out.println("결과코드 : " + sendSMS);	
	
			break;

		case 15:			//예약문자전송시 사용예제
			gotMethod = true;
			smsID =  request.getParameter("smsID");
			hashValue = request.getParameter("hashValue");
			senderPhone =  request.getParameter("senderPhone");
			receivePhone =  request.getParameter("receivePhone");
			smsContent = request.getParameter("smsContent");
			reserveDate =  request.getParameter("reserveDate");
			reserveTime =  request.getParameter("reserveTime");
			userDefine =  request.getParameter("userDefine");
			hash_temp = (smsID + hashValue + receivePhone); //아이디, 패스워드,수신번호를 hash화시킴

			encrypt = new CEncrypt("MD5", hash_temp);
			String sendSMSReserve = smsid.sendSMSReserve(smsID, encrypt.getEncryptData(), senderPhone, receivePhone, smsContent, reserveDate, reserveTime, userDefine);

			out.println("결과코드 : " + sendSMSReserve);

			break;

		case 70:								//SMS예약 취소시 사용됨
			gotMethod = true;
			smsID =  request.getParameter("smsID");
			hashValue =  request.getParameter("hashValue");
			userDefine =  request.getParameter("userDefine");
			mode = request.getParameter("mode");
			hash_temp = (smsID + hashValue + userDefine); //아이디, 패스워드,사용자정의값을 hash화시킴
			encrypt = new CEncrypt("MD5", hash_temp);
			int reserveCancle = smsid.reserveCancle(smsID, encrypt.getEncryptData(), userDefine, mode);
			out.println("결과값 : " + reserveCancle);
			break;

		case 81:								//SMS잔여개수 확인시 사용
			gotMethod = true;
			smsID =  request.getParameter("smsID");
			hashValue =  request.getParameter("hashValue");
			encrypt = new CEncrypt("MD5", smsID + hashValue);
			int getRemainCount = smsid.getRemainCount(smsID, encrypt.getEncryptData());
			out.println("잔여량 : " + getRemainCount);
			break;

		case 87:								//SMS잔여개수 확인시 사용
			gotMethod = true;
			smsID =  request.getParameter("smsID");
			hashValue =  request.getParameter("hashValue");
			encrypt = new CEncrypt("MD5", smsID + hashValue);
			String getRemainDay = smsid.getRemainDay(smsID, encrypt.getEncryptData());
			
			if (getRemainDay.charAt(0) == '-'){
				out.println("오류코드 : " + getRemainDay);
			}
			else if (getRemainDay.charAt(0) == '0'){
				out.println("만료 될 건이 없습니다.");
			}
			else{
				String[] res = getRemainDay.split("\\|");
				out.println(res[0] +"일 후 " + res[1] +"건이 만료됩니다." );
			}
			break;
	}
} catch (Exception e) {
%>
	Exception: <%= e %>
<%
	return;
}
if(!gotMethod){
%>
	Result: N/A
<%
}
%>
</BODY>
</HTML>