package jdbc.wrap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import jdbc.model.Stu;

public class TestCase {

	private static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME = "hr";
	private static String PWD = "oracle";

	public static void main(String[] args) {
		
		
		Stu stu = new Stu(0 , "haha" , 90 , new Timestamp(System.currentTimeMillis()));
		saveStu(stu);
		
	}

	public static void saveStu(Stu stu) {
		
		Connection conn = null ; 
		Statement stmt = null ; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, NAME, PWD); // --> add to list
			stmt = conn.createStatement();
			
			String sql  = "INSERT INTO STU ( SID , SNAME , AGE , HIRE ) VALUES ( SEQ_STU.nextval , '"+stu.getSname()+"' , "+stu.getAge()+" , sysdate)";
			
			
			System.out.println(sql);
			
			stmt.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
