package reserve_modify;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import config.dbconfig;

public class modify_update {
	
	public boolean update(ArrayList<String> al) {
		boolean b = false;
		try {
			dbconfig db = new dbconfig();
			Connection ct = db.getConnection();
			String sql = "update reser_user set rtel=?, remail=?, rpeople=?, rarrival=? where rnumber=?";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, al.get(3));
			ps.setString(2, al.get(4));
			ps.setString(3, al.get(5));
			ps.setString(4, al.get(6));
			ps.setString(5, al.get(7));
			int a = ps.executeUpdate();
			if(a>0) {
				b = true;
			}
			ct.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
}
