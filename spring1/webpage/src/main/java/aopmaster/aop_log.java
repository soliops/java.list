package aopmaster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.aspectj.lang.ProceedingJoinPoint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//지연시간 체크 및 계산
public class aop_log {
	//xml에서 property로 값을 가져와서 변수로 저장하게 됨
	//단, setter, getter가 무조건 있어야만 적용 됩니다.
	private String jdbcurl;
	private String url;
	private String username;
	private String password;
	
	public Object times (ProceedingJoinPoint jp) throws Throwable{
		Class.forName(jdbcurl);
		Connection ct = DriverManager.getConnection(url,username,password);		
		long start =0;
		long end = 0;
		try {
			start = System.currentTimeMillis();
			Object ob = jp.proceed();
			System.out.println(jp.getTarget().getClass().getName());
			return ob;
		} catch (Exception e) {
			throw e;
		}
		finally {
			end = System.currentTimeMillis();
			String sql = "insert into logdata values ('0',?)";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, "총지연시간 : "+(end-start));
			ps.executeUpdate();
			ps.close();
			ct.close();
			System.out.println("총지연시간 : "+(end-start));
		}
	}
}
