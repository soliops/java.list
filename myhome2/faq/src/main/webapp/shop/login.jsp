<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<meta name="viewport" content="width=device, initial-scale=1.0"> 
<!--응용문제

loginok.jsp로 post 전송이며, 아이디는, hong, 패스워드는, hong1234
입니다. 만약에 아이디 및 패스워드가 아닐 경우는
경고메세지 "회원정보를 다시 확인하세요" 라는 문구와 함께
member_login.jsp로 다시 이동되게 하며,
로그인이 되었을 경우는 index.jsp로 이동 되도록 합니다. -->
<form name="frm" id="frm" method="POST" action="./loginok.jsp">
<div style="width:1200px; heigth:500px; margin:0 auto;">
<table border="1" cellspacing="0" cellpadding="0" align="center" style="margin-top:200px;">
<tr>
<td>아이디</td>
<td> <input type="text" name="mid" value=""> </td>
</tr>
<tr>
<td>패스워드</td>
<td> <input type="password" name="mpass" value=""> </td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="로그인">
</td>
<td></td>
</tr>
</form>

</table>


</div>