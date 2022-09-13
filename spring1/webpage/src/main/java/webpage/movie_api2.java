package webpage;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class movie_api2{
	String apikey=null;
	String apidate = null;
	PrintWriter pr = null;
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Resource(name="moviedto")
	private movieDTO dto;
	
	@RequestMapping(value="/movie_api", produces="text/html;charset=utf-8",method=RequestMethod.GET)
	public void apidata(String apikey, String apidate,HttpServletResponse resp) {
		this.apikey = apikey;
		this.apidate = apidate;
		resp.setContentType("text/html; charset=utf-8");
		try {
		pr = resp.getWriter();
		if(this.apikey.equals("movie_opete95")&& !this.apidate.equals("")) {
			String date1 = this.apidate + " 00:00:00";
			String date2 = this.apidate + " 23:59:59";
			SqlSession session = sqlFactory.openSession(); 
			
			List<movieDAO> apidata = dto.list(date1, date2);
			
			//api 키 배열생성 및 출력 파트
			int w = 0;
			JSONArray ja = new JSONArray(); //묶음단위 배열생성
			while(w<apidata.size()) {
				JSONObject jo = new JSONObject(); //키배열 생성
				jo.put("arank",apidata.get(w).getArank());
				jo.put("arankpart",apidata.get(w).getArankpart());
				jo.put("aperson",apidata.get(w).getAperson());
				jo.put("anm", apidata.get(w).getAnm());
				ja.add(jo);
				w++;
			}
			pr.write(ja.toJSONString());
		}
		else {
			pr.write("ERROR:31"); //31 apikey 및 날짜 오류
		}
		}catch(Exception e) {
			pr.write("ERROR:32");
		}
	}
}
