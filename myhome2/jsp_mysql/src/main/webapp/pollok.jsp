<%@page import="java.sql.*"%>
<%@page import="java.time.format.*"%>
<%@page import="java.time.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사 참여자 저장</title>
</head>
<body>
	<%@ include file="dbconnect.jsp"%>
	<%
	String msg = null;
	//replaceAll,replace 차이점
	//trim 공백제거(앞,뒤)
	request.setCharacterEncoding("UTF-8");
	String pname = request.getParameter("usernm").replaceAll(" ","");
	String puserid = request.getParameter("userids").replaceAll(" ","");
	String ptel = request.getParameter("userptel");
	String ptext = request.getParameter("usersel");
	// 		out.print(pname+" 아이디"+puserid+"연락처:"+ptel+"내용: "+ptext);

	String list[] = { pname, puserid, ptel, ptext };
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String pindate = now.format(dft);
	//한번만 참여가 가능하도록 하는 확인 작업 입니다.
	String sql = "select * from poll where pid='" + puserid + "'";
	//회원가입, 설문조사, 이벤트 등은 insert 전에 select를 통해 아이디 중복 검사를 해야한다.
	PreparedStatement ps = null;
	try {
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		if (rs.next() == true) {
			out.print("<script>alert('이미 설문조사 참여 하셨습니다.'); history.go(-1);</script>");
		} else {
		String	sql2 = "insert into poll values('0',";
			int w=0;
			while(w<list.length){
				if(w==list.length-1){
					sql2+="?,'"+pindate+"');";
				}
				else{
					sql2+="?,";
				}
				w++;
			}
			ps = con.prepareStatement(sql2);
			ps.setString(1, pname);
			ps.setString(2, puserid);
			ps.setString(3, ptel);
			ps.setString(4, ptext);
			ps.setString(5, pindate);
			int n= ps.executeUpdate();
			if(n>0) {
				msg = "success"; 
			}
			else {
				throw new Exception("error");
			}
		}

	} catch (Exception e) {
		msg = "fail";
		// 		out.print("alert(msg)");
	} finally {
		if (con != null) {
			con.close();
			// 			out.print("<script>location.href='./select2.jsp';</script>");
// 			response.sendRedirect("./select2.jsp");
		}
	}
	%>
</body>
</html>