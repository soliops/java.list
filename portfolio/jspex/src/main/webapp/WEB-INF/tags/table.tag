<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ tag import="java.sql.*" %>

<%
	Connection con = null;
	try{
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://umj7-009.cafe24.com/opete95";
		String user = "opete95";
		String pw = "soli5857!@";
		Class.forName(driver);
		con = DriverManager.getConnection(url,user,pw);
// 		out.print("DB 접속 성공");
		
		String sql = "select * from poll order by pidx desc;";
		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		String userid =null;
		while(rs.next()){
		 userid = (rs.getString("puserid"));
			}
		request.setAttribute("userid", userid);
		}
		catch(Exception e){
			
		}
	}
	catch(Exception e){
		e.getMessage();
	}

%>