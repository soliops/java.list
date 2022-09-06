package reserve_check;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.dbconfig;

public class check_select {
	public boolean select(ArrayList<String> al) {
		boolean b = false;	
		try {
			dbconfig db = new dbconfig();
			Connection ct = db.getConnection();
			String sql = "select * from reser_user where rnumber = ? and ruser=? and rtel=? and remail=?";
			PreparedStatement ps = ct.prepareStatement(sql);
			for(int i =0; i<al.size();i++) {
				ps.setString(i+1, al.get(i));
			}
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
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
