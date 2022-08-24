package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/hw1";		
		String sql = "UPDATE animal SET NumOfRows = (?) where id in (?)";
				
		Connection con = null;
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "admin");
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "100");
			stmt.setInt(2, 1);			
					
			int result = stmt.executeUpdate();
			System.out.println("result: "+result);
					
			stmt.close();
			con.close();
					
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
