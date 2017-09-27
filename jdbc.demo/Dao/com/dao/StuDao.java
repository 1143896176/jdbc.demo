package com.dao;

import java.util.List;

import jdbc.model.Stu;

public interface StuDao {
	
	public List findStus();
	public void saveStu(Stu stu);

}
