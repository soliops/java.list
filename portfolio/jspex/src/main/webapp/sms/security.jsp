<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.security.MessageDigest" %>
<%@ page import="java.security.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인증발송 및 인증번호 확인</title>
<%!	public class CEncrypt
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
}  %>
<jsp:useBean id="smsid" scope="session" class="test.ServiceSMSSoapProxy" />
<% if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
	smsid.setEndpoint(request.getParameter("endpoint"));
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
%>
</head>
<body>
<%
// 	String randno ="1146542";
	String randno = ""; 
	for(int f=0;f<6;f++){
		randno+=(int)(Math.random()*10);
	}
try{
	String id = "tjoeun705";
	String pw = "t705705!java";
	String tel = "027161006";
	gotMethod = true;
	smsID= id;
	hashValue = pw;
	senderPhone =  tel;
	receivePhone =  request.getParameter("receivePhone");
	smsContent =  "인증번호 : "+randno;
	hash_temp = (smsID + hashValue + receivePhone); //아이디, 패스워드,수신번호를 hash화시킴

	encrypt = new CEncrypt("MD5", hash_temp);
	String sendSMS = smsid.sendSMS(smsID, encrypt.getEncryptData(), senderPhone, receivePhone, smsContent);

// 	out.println("결과코드 : " + sendSMS);
}catch(Exception e){
	e.getMessage();
}

%>
<form name="f" id="f">
발송된 인증번호 입력 : <input type="text" name="seno"> <br>
<input type="button" value="인증확인" onclick="secheck();">
</form>
</body>
<script>
function secheck(){
	var ori = "<%=randno%>";
	//자바스크립트에서 jsp 변수값을 가져오는 부분
	if(f.seno.value==ori){
		alert("인증번호가 확인되었습니다.");
	}
	else{
		alert("인증번호를 다시 확인해 주세요.");
		f.seno.focus();
	}
}
//사용자가 입력한 값과 난수번호로 만들어진 숫자가 동일하면
//인증번호가 확인되었습니다. 라는 메세지를 출력
//단, 인증버호가 틀릴 경우 인증번호를 다시한번 확인 하세요 라는 메세지가
//출력되는 프로세서를 구현하시오.

</script>

</html>