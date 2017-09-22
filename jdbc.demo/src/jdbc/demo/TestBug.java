package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//SQL ×¢Èë
public class TestBug {
	
	private static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME = "hr";
	private static String PWD = "oracle";

	public static void main(String[] args) throws Exception {

		String first = "Steven";
		String last = "1' or '1'='1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(URL, NAME, PWD);

		String sql = "SELECT * FROM EMPLOYEES WHERE FIRST_NAME = '"+first + "' AND LAST_NAME = '"+last+"'";

		Statement stmt = conn.createStatement();
		

		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println("id : " + rs.getInt("employee_id") + " \t Name : " + rs.getString("first_name") + "\t SALARY : " +rs.getInt("SALARY"));
		}

	}

}
