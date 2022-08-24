package reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class list_select {
	static ArrayList<Map<String,Object>> al = null;
	public void list_sel(){
		try {
			dbconfig db = new dbconfig();
			Connection ct = db.getConnection();
			String sql="select * from card;";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.al = new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				Map<String,Object> m = new HashMap<String,Object>();
				m.put("cidx", rs.getString("cidx"));
				m.put("cname", rs.getString("cname"));
				m.put("cemail", rs.getString("cemail"));
				m.put("cbirth", rs.getString("cbirth"));
				m.put("cmethod", rs.getString("cmethod"));
				m.put("cnum", rs.getString("cnum"));
				m.put("ctel", rs.getString("ctel"));
				this.al.add(m);
			}
			ct.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public ArrayList<Map<String,Object>> call_sign() {
		return this.al;
	}
}
