<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%
    ArrayList<Map<String,Object>> data = (ArrayList<Map<String,Object>>)request.getAttribute("data");
   	String tel=(String)data.get(0).get("admin_tel");
   	String part = (String)data.get(0).get("admin_part");
	String position = (String)data.get(0).get("admin_position");
    %>
<div class="admin_login_add">
    <ul>
        <li class="font_color1">관리자 정보 수정</li>
        <li>
        <input type="text" class="add_input1" name="admin_id" value="<%=(String)session.getAttribute("admin_id")%>" readonly>
        </li>
        <li>
            <input type="text" class="add_input1" name="admin_pw" id="admin_pw" placeholder="변경할 패스워드를 입력하세요">
            <input type="text" class="add_input1" name="admin_pw2" id="admin_pw2" placeholder="동일한 패스워드를 입력하세요">
        </li>
        <li class="font_color1">관리자 기본정보 입력</li>
        <li>
            <input type="text" class="add_input1" name="admin_nm" id="admin_nm" value="<%=data.get(0).get("admin_nm")%>">
        </li>
        <li>
        <input type="text" class="add_input1 emails" name="admin_email" id="admin_email" value="<%=data.get(0).get("admin_email")%>">
        </li>
        <li class="font_color1">
        <input type="text" class="add_input1 hp1" maxlength="3" name="admin_tel1" id="admin_tel1" value="<%=tel.substring(0,3)%>">
        -
        <input type="text" class="add_input1 hp2" maxlength="4" name="admin_tel2" id="admin_tel2" value="<%=tel.substring(3,7)%>">
        -
        <input type="text" class="add_input1 hp2" maxlength="4" name="admin_tel3" id="admin_tel3" value="<%=tel.substring(7,11)%>">
        </li>
        <li class="font_color1">관리자 담당부서 및 직책</li>
        <li>
            <select name="admin_part" id="admin_part" class="add_select1">
                <option name="admin_part" value="0">담당자 부서를 선택하세요</option>
                <option name="admin_part" value="임원" <%if(part.equals("임원")){%>selected<%}%>>임원</option>
                <option name="admin_part" value="전산팀" <%if(part.equals("전산팀")){%>selected<%}%>>전산팀</option>
                <option name="admin_part" value="디자인팀" <%if(part.equals("디자인팀")){%>selected<%}%>>디자인팀</option>
                <option name="admin_part" value="CS팀" <%if(part.equals("CS팀")){%>selected<%}%>>CS팀</option>
                <option name="admin_part" value="MD팀" <%if(part.equals("MD팀")){%>selected<%}%>>MD팀</option>
            </select>
            <select name="admin_position" id="admin_position" class="add_select1">
                <option name="admin_position" value="0">담당자 직책을 선택하세요</option>
                <option name="admin_position" value="대표" <%if(position.equals("대표")){%>selected<%}%>>대표</option>
                <option name="admin_position" value="부장" <%if(position.equals("부장")){%>selected<%}%>>부장</option>
                <option name="admin_position" value="팀장" <%if(position.equals("팀장")){%>selected<%}%>>팀장</option>
                <option name="admin_position" value="과장" <%if(position.equals("과장")){%>selected<%}%>>과장</option>
                <option name="admin_position" value="대리" <%if(position.equals("대리")){%>selected<%}%>>대리</option>
                <option name="admin_position" value="사원" <%if(position.equals("사원")){%>selected<%}%>>사원</option>
            </select>
        </li>
        <li class="font_color1">※ 아이디 외에 모든 정보는 수정 할 수 있습니다.</li>
    </ul>
    <span class="admin_addbtn">
        <button type="button" class="btn_button btncolor1" name="admin_info_fin" id="admin_info_fin" title="관리자 등록">정보 수정</button>
    </span>
</div>