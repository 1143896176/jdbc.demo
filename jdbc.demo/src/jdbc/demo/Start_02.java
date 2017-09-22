package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Start_02 {

	private static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME = "hr";
	private static String PWD = "oracle";
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(URL , NAME , PWD) ;
		
		Statement stmt = conn.createStatement();
		String sql = "select *  from STU s";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
//			System.out.println("SID : " + rs.getInt("id"));    // 可以采用  别名  或  index
			System.out.println("SID : " + rs.getInt(1) + ", SNAME : " + rs.getString(2) + " , " + rs.getInt(3) + " , " + rs.getTimestamp(4)); 
		}
		
		
		
	}
}
