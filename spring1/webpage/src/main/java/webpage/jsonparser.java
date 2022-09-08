package webpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.dbcp.BasicDataSource;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 최초 api 데이터를 로드시에는 객체형 프로그램으로 실행 합니다.
 JSON 라이브러리를 이용하여 해당 api 배열 데이터를 키값을 분리 되도록 합니다.
 출력 확인 후 Controller로 변경합니다.
 단, 변경시 주의사항은 객체형 main 메소드를 변경하셔야 합니다.
 그 외에 @Autowired, @RequestMapping 이용해서 웹페이지로 실행 시킨 후 DB 입력값을
 확인하게 됩니다.
 */



@Controller
//객체 지향 -> servlet형태로 전환
public class jsonparser {
	//영화 진흥원 api 데이터 파일
	@Autowired
	BasicDataSource dataConnect;
	
	@RequestMapping("jsonparser.do")
	public void parser() {
		String nowtime=null;
		try {
			Connection ct = dataConnect.getConnection();
			
			/* 서버에 있는 시간을 로드 하여 입력시 활용하는 query 코드 입니다. */
			String todays = "select now() as today";
			PreparedStatement ps1 = ct.prepareStatement(todays);
			ResultSet rs = ps1.executeQuery();
			while(rs.next()) {
				nowtime = rs.getString("today");
			}
			String jsondata ="[{\"rnum\":\"1\",\"rank\":\"1\",\"rankInten\":\"4\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20215601\",\"movieNm\":\"공조2: 인터내셔날\",\"openDt\":\"2022-09-07\",\"salesAmt\":\"2111639540\",\"salesShare\":\"74.0\",\"salesInten\":\"2082328540\",\"salesChange\":\"7104.3\",\"salesAcc\":\"2214163540\",\"audiCnt\":\"216304\",\"audiInten\":\"213053\",\"audiChange\":\"6553.5\",\"audiAcc\":\"227402\",\"scrnCnt\":\"2167\",\"showCnt\":\"10152\"},{\"rnum\":\"2\",\"rank\":\"2\",\"rankInten\":\"-1\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20217826\",\"movieNm\":\"육사오(6/45)\",\"openDt\":\"2022-08-24\",\"salesAmt\":\"164228269\",\"salesShare\":\"5.8\",\"salesInten\":\"-275828897\",\"salesChange\":\"-62.7\",\"salesAcc\":\"12382654766\",\"audiCnt\":\"17032\",\"audiInten\":\"-27949\",\"audiChange\":\"-62.1\",\"audiAcc\":\"1233521\",\"scrnCnt\":\"743\",\"showCnt\":\"2000\"},{\"rnum\":\"3\",\"rank\":\"3\",\"rankInten\":\"0\",\"rankOldAndNew\":\"NEW\",\"movieCd\":\"20212709\",\"movieNm\":\"블랙폰\",\"openDt\":\"2022-09-07\",\"salesAmt\":\"105377437\",\"salesShare\":\"3.7\",\"salesInten\":\"105377437\",\"salesChange\":\"100\",\"salesAcc\":\"257667437\",\"audiCnt\":\"10678\",\"audiInten\":\"10678\",\"audiChange\":\"100\",\"audiAcc\":\"26618\",\"scrnCnt\":\"480\",\"showCnt\":\"1450\"},{\"rnum\":\"4\",\"rank\":\"4\",\"rankInten\":\"0\",\"rankOldAndNew\":\"NEW\",\"movieCd\":\"20183867\",\"movieNm\":\"알라딘\",\"openDt\":\"2019-05-23\",\"salesAmt\":\"74181000\",\"salesShare\":\"2.6\",\"salesInten\":\"74181000\",\"salesChange\":\"100\",\"salesAcc\":\"108234730039\",\"audiCnt\":\"6512\",\"audiInten\":\"6512\",\"audiChange\":\"100\",\"audiAcc\":\"12730289\",\"scrnCnt\":\"39\",\"showCnt\":\"238\"},{\"rnum\":\"5\",\"rank\":\"5\",\"rankInten\":\"-3\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20211792\",\"movieNm\":\"헌트\",\"openDt\":\"2022-08-10\",\"salesAmt\":\"55319341\",\"salesShare\":\"1.9\",\"salesInten\":\"-153339477\",\"salesChange\":\"-73.5\",\"salesAcc\":\"42974976697\",\"audiCnt\":\"6404\",\"audiInten\":\"-14536\",\"audiChange\":\"-69.4\",\"audiAcc\":\"4166555\",\"scrnCnt\":\"585\",\"showCnt\":\"1143\"},{\"rnum\":\"6\",\"rank\":\"6\",\"rankInten\":\"9\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20226879\",\"movieNm\":\"인생은 뷰티풀: 비타돌체\",\"openDt\":\"2022-09-07\",\"salesAmt\":\"181029000\",\"salesShare\":\"6.3\",\"salesInten\":\"158488000\",\"salesChange\":\"703.1\",\"salesAcc\":\"235784000\",\"audiCnt\":\"5231\",\"audiInten\":\"4653\",\"audiChange\":\"805\",\"audiAcc\":\"6635\",\"scrnCnt\":\"102\",\"showCnt\":\"145\"},{\"rnum\":\"7\",\"rank\":\"7\",\"rankInten\":\"-3\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20194376\",\"movieNm\":\"탑건: 매버릭\",\"openDt\":\"2022-06-22\",\"salesAmt\":\"48117358\",\"salesShare\":\"1.7\",\"salesInten\":\"-36776323\",\"salesChange\":\"-43.3\",\"salesAcc\":\"86627331405\",\"audiCnt\":\"3433\",\"audiInten\":\"-3744\",\"audiChange\":\"-52.2\",\"audiAcc\":\"8082038\",\"scrnCnt\":\"104\",\"showCnt\":\"226\"},{\"rnum\":\"8\",\"rank\":\"8\",\"rankInten\":\"-5\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20209343\",\"movieNm\":\"한산: 용의 출현\",\"openDt\":\"2022-07-27\",\"salesAmt\":\"18788800\",\"salesShare\":\"0.7\",\"salesInten\":\"-50840150\",\"salesChange\":\"-73\",\"salesAcc\":\"72959917186\",\"audiCnt\":\"2428\",\"audiInten\":\"-5543\",\"audiChange\":\"-69.5\",\"audiAcc\":\"7177391\",\"scrnCnt\":\"265\",\"showCnt\":\"405\"},{\"rnum\":\"9\",\"rank\":\"9\",\"rankInten\":\"2\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20225892\",\"movieNm\":\"시맨틱 에러: 더 무비\",\"openDt\":\"2022-08-31\",\"salesAmt\":\"20544100\",\"salesShare\":\"0.7\",\"salesInten\":\"10634700\",\"salesChange\":\"107.3\",\"salesAcc\":\"393364400\",\"audiCnt\":\"2017\",\"audiInten\":\"1056\",\"audiChange\":\"109.9\",\"audiAcc\":\"33314\",\"scrnCnt\":\"32\",\"showCnt\":\"32\"},{\"rnum\":\"10\",\"rank\":\"10\",\"rankInten\":\"-3\",\"rankOldAndNew\":\"OLD\",\"movieCd\":\"20219345\",\"movieNm\":\"놉\",\"openDt\":\"2022-08-17\",\"salesAmt\":\"8489080\",\"salesShare\":\"0.3\",\"salesInten\":\"-17843310\",\"salesChange\":\"-67.8\",\"salesAcc\":\"4593492276\",\"audiCnt\":\"1255\",\"audiInten\":\"-1222\",\"audiChange\":\"-49.3\",\"audiAcc\":\"404563\",\"scrnCnt\":\"30\",\"showCnt\":\"39\"}]";
			JSONParser parser = new JSONParser();
			JSONArray jarray = (JSONArray)parser.parse(jsondata);
			for(int j=0;j<jarray.size();j++) {
				JSONObject jobject = (JSONObject)jarray.get(j);
				String datain = "insert into apimovie values('0',?,?,?,?,?)";
				PreparedStatement ps = ct.prepareStatement(datain);
				ps.setString(1, (String)jobject.get("rank"));
				ps.setString(2, (String)jobject.get("rankOldAndNew"));
				ps.setString(3, (String)jobject.get("audiAcc"));
				ps.setString(4, (String)jobject.get("movieNm"));
				ps.setString(5, (String)jobject.get("openDt")+ " 00:00:00");
				ps.executeUpdate();
			}			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
			/*
			if(result instanceof JSONObject) {
				JSONObject jobject = (JSONObject) result;				
				System.out.println(jobject);
			}
		*/
	}
	
}
