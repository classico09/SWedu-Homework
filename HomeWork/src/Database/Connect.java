package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Connect {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/hw1";
		
		String sql = "SELECT * FROM animal";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "admin");
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			rs.next();
			
			String Place = rs.getString("Place");
			
			System.out.println("Place:"+Place);
			
			rs.close();
			st.close();
			con.close();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
