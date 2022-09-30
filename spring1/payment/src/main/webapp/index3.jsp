<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.inicis.std.util.SignatureUtil"%>
<%@page import="java.util.*"%>    
<%

	String mid					= "INIpayTest";		                    // 상점아이디					
	String signKey			    = "SU5JTElURV9UUklQTEVERVNfS0VZU1RS";	// 웹 결제 signkey
	String goodcode	= request.getParameter("goodcode"); 
	String mKey = SignatureUtil.hash(signKey, "SHA-256");

	String timestamp			= SignatureUtil.getTimestamp();			// util에 의해서 자동생성
	String orderNumber			= mid+"_"+goodcode;	// 가맹점 주문번호(가맹점에서 직접 설정)
	String price				= request.getParameter("price");	// 상품가격(특수기호 제외, 가맹점에서 직접 설정)


	Map<String, String> signParam = new HashMap<String, String>();

	signParam.put("oid", orderNumber);
	signParam.put("price", price);
	signParam.put("timestamp", timestamp);

	String signature = SignatureUtil.makeSignature(signParam);
	
	/* index2.jsp 데이터 이관 */
	String version = request.getParameter("version");
	String currency = request.getParameter("currency");
	String goodname = request.getParameter("goodname");
	String goodea = request.getParameter("goodea"); 
	String buyerid = request.getParameter("buyerid"); 
	String buyername = request.getParameter("buyername");
	String buyertel = request.getParameter("buyertel");
	String buyeremail = request.getParameter("buyeremail");
	String rec_name = request.getParameter("rec_name");
	String rec_tel = request.getParameter("rec_tel");
	String rec_addr = request.getParameter("rec_addr");
	String point = request.getParameter("point");
	String gopaymethod = request.getParameter("gopaymethod");
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>최종 결제 적용</title>
</head>
<script language="javascript" type="text/javascript" src="https://stgstdpay.inicis.com/stdjs/INIStdPay.js" charset="UTF-8"></script>
<script>
function payment(){
	INIStdPay.pay('pay');
}
</script>
<body>
<form name="pay" id="pay" >
<input type="hidden" name="version" value="<%=version%>">
<input type="hidden" name="gopaymethod" value="<%=gopaymethod%>">
<input type="hidden" name="mid" value="<%=mid%>">
<input type="hidden" name="oid" value="<%=orderNumber%>">
<input type="hidden" name="price" value="<%=price%>">
<input type="hidden" name="timestamp" value="<%=timestamp%>">
<input type="hidden" name="signature" value="<%=signature%>">
<input type="hidden" name="mKey" value="<%=mKey%>">
<input type="hidden" name="currency" value="<%=currency%>">
<input type="hidden" name="buyername" value="<%=buyername%>">
<input type="hidden" name="buyertel" value="<%=buyertel%>">
<input type="hidden" name="buyeremail" value="<%=buyeremail%>">
<input type="hidden" name="returnUrl" value="http://opete95.cafe24.com/payment/INIstdpay_pc_return.jsp/">
<input type="hidden" name="closeUrl" value="http://opete95.cafe24.com/payment/close.jsp/">
<input type="hidden" name="goodname" value="<%=goodname %>">
<p>-----------결제자 정보------------</p> 
고객아이디 : <%=buyerid %><br>
고객명 : <%=buyername %><br>
고객연락처 : <%=buyertel %><br>
고객이메일 : <%=buyeremail%><br>
<p>-----------상품 정보-------------</p>
상품코드 : <%=goodcode %><br>
상품명 : <%=goodname %><br>
상품수량 : <%=goodea %> EA<br>
<p>-----------배송지 정보-------------</p>
수령인 : <%=rec_name %><br>
수령인 연락처 : <%=rec_tel %><br>
배송지 주소 : <%=rec_addr %><br>
적립금 사용금액 : <%=point %> 원<br>
<p>----------결제금액 및 결제수단-------------</p>
최종결제금액 : <%=price %>원<br>
결제수단 : <%=gopaymethod %><br>
<br> <br>
<input type="button" value="결제하기" onclick="payment();">
</form>
</body>
</html>