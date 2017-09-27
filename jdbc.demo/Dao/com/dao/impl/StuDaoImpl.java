package com.dao.impl;

import java.util.List;

import com.dao.StuDao;

import jdbc.model.Stu;
import utils.JDBCUtils;

public class StuDaoImpl implements StuDao {
	
	JDBCUtils utils = new JDBCUtils();
	
	@Override
	public List findStus() {
		
		return  utils.findByType("select * from STU WHERE SID < ? ", Stu.class, 5);	
	}
	
	@Override
	public void saveStu(Stu stu) {
		
		utils.executeUpdate("", null );
	}

}
