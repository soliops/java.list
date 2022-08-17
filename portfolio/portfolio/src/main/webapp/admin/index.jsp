<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 페이지</title>
    <link rel="stylesheet" type="text/css" href="./css/basic.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css?v=1">
    <link rel="icon" href="./img/logo.png" sizes="128x128">
    <link rel="icon" href="./img/logo.png" sizes="64x64">
    <link rel="icon" href="./img/logo.png" sizes="32x32">
    <link rel="icon" href="./img/logo.png" sizes="16x16">
    <script src="./js/jquery.js"></script>
    <script>
    $(function(){
    	$("#admin_login").click(function(){ 
    		if($("#admin_log_id").val()==""){
    			alert("관리자 아이디를 입력하세요.");
    		}
    		else if($("#admin_log_pw").val()==""){
    			alert("관리자 패스워드를 입력하세요.");    			
    		}
    		else{
    			admin_log_frm.method="POST";
    			admin_log_frm.enctype="application/x-www-form-urlencoded";
    			admin_log_frm.action="../loginok.do";
    			admin_log_frm.submit();
    		}
    	})
    	
    	$("#admin_new").click(function(){ 
    		location.href="./add_master.html";
    	})
    	$("#admin_find").click(function(){ 
    		location.href="./add_master_search.html";
    	})
    });
    
    </script>
</head>
<body>
<%    String id = (String)session.getAttribute("admin_id");
		if(id!=null){        
    	out.print("<script>location.href='./admin_main.jsp';</script>");
    	}
   %>
<!-- 로그인할때 세션 걸어놓고, null이면 로그인 화면, null이 아니면 다시 redirect로 메인페이지로 -->
    <header class="admin_title">
        <p><img src="./img/logo.png" class="logo_sm"> ADMINISTRATOR</p>
    </header>
    <section class="admin_bgcolor">
        <div class="admin_login">
            <span>
        <form name="admin_log_frm" id="admin_log_frm">
                <div class="left_div">
                <ul>
                <li><input type="text" class="input_text1" name="admin_log_id" id="admin_log_id" placeholder="관리자 아이디를 입력하세요"></li>
                <li><input type="password" class="input_text1" name="admin_log_pw" id="admin_log_pw" placeholder="관리자 패스워드를 입력하세요"></li>
                </ul>
                </div>
                <div class="right_div">
                    <button type="submit" class="btn_submit" name="admin_login" id="admin_login" title="MASTER LOGIN">MASTER LOGIN</button>
                </div>
                <em class="alert_msg">※ 본 사이트는 관리자 외에는 접근을 금합니다. 페이지 접근에 대한 접속 정보는 모두 기록 됩니다.</em>
        </form>
            </span>
            <span>
                <ol class="admin_info">
                   	<li title="신규 관리자 등록요청"><input type="button" value="신규 관리자 등록요청" class="admin_info_input1" id="admin_new"></li>
                    <li title="아이디/패스워드 찾기"><input type="button" value="아이디/패스워드 찾기" class="admin_info_input2" id="admin_find"></li>
                </ol>                
            </span>
        </div>
    </section>
    <footer class="admin_copy_login">
        <div>
            Copyright ⓒ 2022 webshopping All rights reserved.
        </div>
    </footer>
</body>
</html>