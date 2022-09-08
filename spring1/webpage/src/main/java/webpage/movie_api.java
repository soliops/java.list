package webpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.inject.Inject;
import javax.swing.text.html.HTMLEditorKit.Parser;

import org.apache.commons.dbcp.BasicDataSource;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class movie_api {
	private String apikey=null;
	private String apidate=null;
	private String result=null;
	protected String json_parsing = null;
	@Autowired
	BasicDataSource dataConnect;
	
	//method=RequestMethod.GET을 쓰거나 @GetMapping을 쓰거나
	//둘중 하나만 쓰면 method는 GET으로만 받는다
	// Front에서 전송된 데이터를 get으로만 통신하겠다는 뜻
	//@GetMapping, @PostMapping, @PutMapping, @DeleteMapping : method 속성을 사용하지 않습니다.
	@RequestMapping(value="movie", produces="text/html;charset=utf-8",method=RequestMethod.GET)
	public String apiserver(String apikey, String apidate){
		try {
		this.apikey = apikey;			
		this.apidate = apidate;
		if(!this.apikey.equals("null")||!this.apikey.equals("")) {
			if(this.apikey.equals("movie_opete95")&&!this.apidate.equals("")) {
				//DB 호출
				Connection ct = dataConnect.getConnection();
				String sdate = this.apidate + " 00:00:00";
				String edate = this.apidate + " 23:59:59";
				
				String sql = "select * from apimovie where aindate>='"+sdate+"' and aindate<='"+edate+"'";
				PreparedStatement ps = ct.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				JSONArray ja = new JSONArray();
				while(rs.next()) {
					JSONObject jb = new JSONObject();
					jb.put("aidx", rs.getString("aidx"));
					jb.put("arank", rs.getString("arank"));
					jb.put("arankpart", rs.getString("arankpart"));
					jb.put("aperson", rs.getString("aperson"));
					jb.put("anm", rs.getString("anm"));
					jb.put("aindate", rs.getString("aindate"));
//					this.json_parsing = jb.toString();
					ja.add(jb);
				}
				this.result=ja.toString();
				
				
			}
			else {
				this.result="error : { 해당 api키가 올바르지 않습니다. }";				
			}
		}
		} catch (Exception e) {
			this.result="error : { 해당 api키가 올바르지 않습니다. }";
		}
		return this.result;
	}
}
