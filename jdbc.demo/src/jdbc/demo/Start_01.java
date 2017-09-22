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
		
		//��������
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//��������
		Connection conn = DriverManager.getConnection(URL , NAME, PWD);   // --> add to list
		//����ָ��(���)���� 
		Statement stmt = conn.createStatement();

		//sql
		String sql_insert = "INSERT INTO STU ( SID , SNAME , AGE , HIRE ) VALUES ( SEQ_STU.nextval , 'jack' , 33 , SYSDATE)";
//		String sql_update = "UPDATE STU SET SNAME = 'tom2' where SID = 1 ";
//		String sql_remove = "DELETE FROM STU WHERE SID = 2";
//		
		//ִ��
		stmt.execute(sql_insert); //execute �������� ִ�� ��ɾ��  executeQuery(sql) ���ڲ�ѯ
		//�ر���Դ  �Ժ� ��Ҫ���� �ͷ�
		stmt.close();
		conn.close();
		
	
		
	}

}
