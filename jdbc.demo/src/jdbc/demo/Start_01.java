package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Start_01 {

	private static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String NAME = "hr";
	private static String PWD = "oracle";
	
	public static void main(String[] args) throws Exception{
		
		//加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//创建连接
		Connection conn = DriverManager.getConnection(URL , NAME, PWD);   // --> add to list
		//创建指令(语句)对象 
		Statement stmt = conn.createStatement();

		//sql
		String sql_insert = "INSERT INTO STU ( SID , SNAME , AGE , HIRE ) VALUES ( SEQ_STU.nextval , 'jack' , 33 , SYSDATE)";
//		String sql_update = "UPDATE STU SET SNAME = 'tom2' where SID = 1 ";
//		String sql_remove = "DELETE FROM STU WHERE SID = 2";
//		
		//执行
		stmt.execute(sql_insert); //execute 方法用于 执行 增删改  executeQuery(sql) 用于查询
		//关闭资源  以后 需要做到 释放
		stmt.close();
		conn.close();
		
	
		
	}

}
