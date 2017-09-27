package com.service;

import java.util.List;

import com.dao.StuDao;
import com.dao.TeacherDao;
import com.dao.impl.StuDaoImpl;
import com.dao.impl.TeahcerDaoImpl;

public class InitService {
	

	private StuDao stuDao = new StuDaoImpl();
	private TeacherDao teacherDao = new TeahcerDaoImpl();
	
	public List mergeData() {
		teacherDao.findTeachers();
		return stuDao.findStus();	
	}

}
