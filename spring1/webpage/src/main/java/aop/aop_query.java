package aop;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

//각종 query
public class aop_query {
	
	//setter, getter 
	aop_info info = new aop_info();
	
	//회원 가입
	public void insert() {
		//해당 값을 주입
		info.aop_info2("insert");
	}
	//회원 가입 삭제
	public void delete() throws Exception{
		//해당 값을 주입
		info.aop_info2("delete");
		System.out.println("사용자 삭제");
	}
}
