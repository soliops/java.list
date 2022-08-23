<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
	<meta charset="UTF-8">
<%
ArrayList<Map<String,Object>> al = (ArrayList<Map<String,Object>>)request.getAttribute("als");
%>	
<p>신규등록 관리자</p>
<ol class="new_admin_title">
    <li>NO</li>
    <li>관리자명</li>
    <li>아이디</li>
    <li>전화번호</li>
    <li>이메일</li>
    <li>담당부서</li>
    <li>담당직책</li>
    <li>가입일자</li>
    <li>승인여부</li>
</ol>
<%if(al.size()==0){%>
<ol class="new_admin_none">
    <li>신규 등록된 관리자가 없습니다.</li>
</ol>
<%}
else{
int w = 0;
int c = 1;
while(w<al.size()){
%>
<ol class="new_admin_lists">
    <li><%=al.get(w).get("admin_idx") %></li>
    <li><%=al.get(w).get("admin_nm") %></li>
    <li><%=al.get(w).get("admin_id") %></li>
    <li><%=al.get(w).get("admin_tel") %></li>
    <li><%=al.get(w).get("admin_email") %></li>
    <li><%=al.get(w).get("admin_part") %></li>
    <li><%=al.get(w).get("admin_position") %></li>
	 <% String indate = (String)al.get(w).get("admin_indate"); %>
    <li><%=indate.substring(0,19) %></li>
    <li>
        <input type="button" value="승인" class="new_addbtn1" title="승인" onclick="approval('<%=al.get(w).get("admin_id") %>','Y');">
        <input type="button" value="미승인" class="new_addbtn2" title="미승인" onclick="approval('<%=al.get(w).get("admin_id") %>','N');">
    </li>
</ol>    
 <% w++;
		}
    }
 %>