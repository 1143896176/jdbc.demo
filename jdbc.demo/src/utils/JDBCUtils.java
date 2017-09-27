package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.config.AppConfig;

public class JDBCUtils {
	
	private Connection conn;
	
	public void openConnection() {
		try {
			Class.forName(AppConfig.DRIVER);
			conn = DriverManager.getConnection(AppConfig.URL , AppConfig.NAME , AppConfig.PWD) ;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//适用于各种 增删改...
	public int executeUpdate(String sql , Object[] params) {
		int row = 0;
		openConnection();
		System.out.println(sql);
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if(params!=null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1 , params[i]);
				}
			}
			row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	
	//适用于多表查询
	public ResultSet executeQuery(String sql , Object... params) {
		openConnection();
		System.out.println(sql);
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement(sql);
			if(params!=null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1 , params[i]);
				}
			}
			rs = ps.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}

}
