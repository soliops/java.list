<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./db.jsp" %>
<meta charset="UTF-8">
<%
	request.setCharacterEncoding("UTF-8");
//left로 Table 2개를 join한 상태
	response.setContentType("text/html;charset=UTF-8");
	String sql = "select a.gidx,a.gwriter,a.gsubject,a.gcount,a.gindate,b.gfileurl,count(b.gidx) as ct from gboard as a left join gboard_img as b on a.gidx = b.gidx group by a.gidx,b.gidx;";
	PreparedStatement ps = null;
	ResultSet rs = null;
	ArrayList<Map<String,Object>> al = null;
	try {
		ps = con.prepareStatement(sql);
		rs=ps.executeQuery();
		al = new ArrayList<>();
		while(rs.next()){
			Map<String,Object> mp = new HashMap<>();
			mp.put("gwriter",rs.getString("gwriter"));
			mp.put("gsubject",rs.getString("gsubject"));
			mp.put("gcount",rs.getString("gcount"));
			mp.put("gindate",rs.getString("gindate").substring(0,10));
			mp.put("gimg",rs.getString("gfileurl"));
			mp.put("rd",rs.getString("ct"));			
			al.add(mp);			
		}
	}
	catch(Exception e){
		e.getMessage();	
	}
%>
