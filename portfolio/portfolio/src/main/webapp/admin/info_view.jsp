<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
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
            <input type="text" class="add_input1" name="admin_nm" id="admin_nm">
        </li>
        <li>
        <input type="text" class="add_input1 emails" name="admin_email" id="admin_email">
        </li>
        <li class="font_color1">
        <input type="text" class="add_input1 hp1" maxlength="3" name="admin_tel1" id="admin_tel1">
        -
        <input type="text" class="add_input1 hp2" maxlength="4" name="admin_tel2" id="admin_tel2">
        -
        <input type="text" class="add_input1 hp2" maxlength="4" name="admin_tel3" id="admin_tel3">
        </li>
        <li class="font_color1">관리자 담당부서 및 직책</li>
        <li>
            <select name="admin_part" id="admin_part" class="add_select1">
                <option name="admin_part" value="0">담당자 부서를 선택하세요</option>
                <option name="admin_part" value="임원">임원</option>
                <option name="admin_part" value="전산팀">전산팀</option>
                <option name="admin_part" value="디자인팀">디자인팀</option>
                <option name="admin_part" value="CS팀">CS팀</option>
                <option name="admin_part" value="MD팀">MD팀</option>
            </select>
            <select name="admin_position" id="admin_position" class="add_select1">
                <option name="admin_position" value="0">담당자 직책을 선택하세요</option>
                <option name="admin_position" value="대표" >대표</option>
                <option name="admin_position" value="부장" >부장</option>
                <option name="admin_position" value="팀장" >팀장</option>
                <option name="admin_position" value="과장" >과장</option>
                <option name="admin_position" value="대리" >대리</option>
                <option name="admin_position" value="사원" >사원</option>
            </select>
        </li>
        <li class="font_color1">※ 아이디 외에 모든 정보는 수정 할 수 있습니다.</li>
    </ul>
    <span class="admin_addbtn">
        <button type="button" class="btn_button btncolor1" name="admin_info_fin" id="admin_info_fin" title="관리자 등록">정보 수정</button>
    </span>
</div>