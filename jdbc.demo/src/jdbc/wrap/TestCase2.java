package jdbc.wrap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.model.Stu;
import utils.JDBCUtils;

public class TestCase2 {

	private static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME = "hr";
	private static String PWD = "oracle";

	public static void main(String[] args) {
		
		
//		Stu stu = new Stu(0 , "haha6" , 93 , new Timestamp(System.currentTimeMillis()));
//		saveStu2(stu);
		
//		removeStu(10);
		queryStu();
	}
	
	
	public static void queryStu() {
		JDBCUtils utils = new JDBCUtils();
		
		String sql = "select *  from STU";
		Object[] params = { null };
		
		ResultSet rs = utils.executeQuery(sql, null);
		
		try {
			while(rs.next()) {
				System.out.println("SID : " + rs.getInt(1) + ", SNAME : " + rs.getString(2) + " , " + rs.getInt(3) + " , " + rs.getTimestamp(4)); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void removeStu(int id) {
		JDBCUtils utils = new JDBCUtils();
		
		String sql  = "delete from stu where sid = ?";
		Object[] params = { id };
		
		int row = utils.executeUpdate(sql, params);
		
		System.out.println("row : " +row);
	}
	
	
	public static void saveStu2(Stu stu) {
		JDBCUtils utils = new JDBCUtils();
		
		String sql  = "INSERT INTO STU ( SID , SNAME , AGE , HIRE ) VALUES ( SEQ_STU.nextval , ? , ? , ? )";
		Object[] params = { stu.getSname() , stu.getAge() , stu.getHire() };
		
		int row = utils.executeUpdate(sql, params);
		
		System.out.println("row : " +row);
	}

	public static void saveStu(Stu stu) {
		
		Connection conn = null ; 
		PreparedStatement ps = null; //防注入 , 缓存语句
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, NAME, PWD); // --> add to list
			conn.setAutoCommit(false);
			
			String sql  = "INSERT INTO STU ( SID , SNAME , AGE , HIRE ) VALUES ( SEQ_STU.nextval , ? , ? , ? )"; //占位符
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, stu.getSname());
			ps.setInt(2, stu.getAge());
			ps.setTimestamp(3, stu.getHire());
			
			int affectRows = ps.executeUpdate(); // 用来执行 增删改
			
			System.out.println(sql);
			
			System.out.println(affectRows + " 条记录 被成功录入 ");
			
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
