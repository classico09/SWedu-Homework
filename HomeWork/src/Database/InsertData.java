package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/hw1";
		String sql = "INSERT INTO animal (id, Dt, Place, Kind, Color, Age, Weight, Notice, Sdt, Edt, Popfile, ProcessState, Sex, Neuter, SpecialMark, CareNm, CareTel, CareAddr, OrgNm, ChargeNm, Officetel, NumOfRows, PageNo, TotalCount) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "admin");
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, 6);
			stmt.setString(2, "20211231");
			stmt.setString(3, "동일로 140길 33 인근");
			stmt.setString(4, "[고양이] 한국 고양이");
			stmt.setString(5, "검");
			stmt.setString(6, "2020(년생)");
			stmt.setString(7, "2.8(Kg)");
			stmt.setString(8, "서울-중랑-2022-00002");
			stmt.setInt(9, 20220104);
			stmt.setInt(10, 20220114);
			stmt.setString(11, "http://www.animal.go.kr/files/shelter/2021/12/202201031501688.jpg");
			stmt.setString(12, "종료(자연사)");
			stmt.setString(13, "F");
			stmt.setString(14, "U");
			stmt.setString(15, "구강질환 기립불능 기력없음 저체온 털상태불량");
			stmt.setString(16, "한국동물구조관리협회");
			stmt.setString(17, "031-867-9119");
			stmt.setString(18, "경기도 양주시 남면 감악산로 63-37");
			stmt.setString(19, "서울특별시 중랑구");
			stmt.setString(20, "김가희");
			stmt.setString(21, "02-2094-0753");
			stmt.setInt(22, 10);
			stmt.setInt(23, 1);
			stmt.setInt(24, 8309);
			
			//add to table
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
