package admin_configure;

import java.sql.*;
import java.util.*;

public class admin_list_select {
	//지울거
	static ArrayList<Map<String,Object>> al = null;
	public void list_data() {
		Connection ct =null;
		try{
			dbconfig db = new dbconfig();
			ct =db.cafe24();
			String sql = "select * from admin_add order by admin_idx desc;";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			this.al = new ArrayList<>();
			while(rs.next()){
				Map<String,Object> m = new HashMap<String,Object>();
				m.put("admin_idx",rs.getString("admin_idx"));
				m.put("admin_id",rs.getString("admin_id"));			
				m.put("admin_nm",rs.getString("admin_nm"));
				m.put("admin_email",rs.getString("admin_email"));
				m.put("admin_tel",rs.getString("admin_tel"));
				m.put("admin_part",rs.getString("admin_part"));
				m.put("admin_position",rs.getString("admin_position"));
				m.put("admin_indate",rs.getString("admin_indate"));
				m.put("admin_check",rs.getString("admin_check"));
				this.al.add(m);
			}
		}
		catch(Exception e){
		
		}
		finally{
			try{
				if(ct!=null){
					ct.close();
				}
			}
			catch(Exception f){
				
			}
		}

	}
	public ArrayList<Map<String,Object>> al_data (){
		return this.al;
	}
}
