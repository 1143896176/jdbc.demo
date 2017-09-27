package jdbc.wrap;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import utils.JDBCUtils;

public class TestCase3 {
	
	public static void main(String[] args) throws Exception {
		
		JDBCUtils utils = new JDBCUtils();
		
		ResultSet rs = utils.executeQuery("select * from STU", null);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
			System.out.println(rsmd.getColumnName(i).toLowerCase());
		}
		
		
	}

}
