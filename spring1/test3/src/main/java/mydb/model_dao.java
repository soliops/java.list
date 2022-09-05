package mydb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

//dao : getter, setter
public class model_dao {
	//xml에 있는 id값을 Model에서 직접적으로 핸들링할 수 없습니다.
	@Autowired
	BasicDataSource dataSource; //null로 표기가 됨
	
	Connection ct = null;
	PreparedStatement ps = null;
	
	private String midx;
	private String mid;
	private String mpw;
	private String mnm;
	private String mtel;
	private String mage;
	public String getMidx() {
		return midx;
	}
	public void setMidx(String midx) {
		this.midx = midx;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMnm() {
		return mnm;
	}
	public void setMnm(String mnm) {
		this.mnm = mnm;
	}
	public String getMtel() {
		return mtel;
	}
	public void setMtel(String mtel) {
		this.mtel = mtel;
	}
	public String getMage() {
		return mage;
	}
	public void setMage(String mage) {
		this.mage = mage;
	}
	//Controller에서 정보값을 받는 역할을 하게 됨
	public model_dao(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}
	public String d_select() { //DB를 연결시켜서 SQL을 실행시킴
		String ctn =null;
		try {
			String sql = "select count(*) as ctn from test3";
			ct = this.dataSource.getConnection();
			ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			ctn = rs.getString("ctn");
			}
		}	
		catch (Exception e) {
			
		}
		finally {
			try {
				if(ct!=null)ct.close();
				if(ps!=null)ps.close();
			} catch (Exception e2) {
			}
		}
		return ctn;
	}
	
}
