package org.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.student.entity.Student;

public class StudentDao {
	public Connection conn;
	public DBConnection db;
	public Student queryStudentByName(String name,String pwd) throws SQLException {
		Student student=null;
		PreparedStatement ps=null;
		db=new DBConnection();
		conn=db.getconn();
		String sql="select * from user where name=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			if(rs.getString("passwd").equals(pwd)) {
				student=new Student(rs.getString("username"),rs.getString("passwd"),rs.getString("name"),rs.getInt("id"),rs.getInt("age"),rs.getString("address"));
			}
		}
		conn.close();
		return student;
	}
	public boolean isExist(String name,String pwd) throws SQLException {
			return queryStudentByName(name, pwd)==null ?false:true;
	}
	public void addStudent(int id,String name,String pwd) throws SQLException {
		Student student=new Student(id,name, pwd);
		PreparedStatement ps=null;
		db=new DBConnection();
		conn=db.getconn();
		String sql="insert into user values(?,?,?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,student.getId());
		ps.setString(2,student.getUsername());
		ps.setString(3,student.getName());
		ps.setInt(4,student.getAge());
		ps.setString(5,student.getAddress());
		ps.setString(6,student.getPwd());
		ps.executeUpdate();
		conn.close();
	}
}
