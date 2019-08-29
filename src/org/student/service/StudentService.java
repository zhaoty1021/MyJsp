package org.student.service;

import java.sql.SQLException;

import org.student.dao.StudentDao;

public class StudentService {
	public boolean addStudent(int id,String name,String pwd) throws SQLException {
		boolean result=false;
		StudentDao studentdao=new StudentDao();
		studentdao.addStudent(id, name, pwd);
		if(studentdao.isExist(name, pwd)) {
			result=true;
		}
		return result;
	}
}
