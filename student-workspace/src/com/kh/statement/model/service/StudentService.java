package com.kh.statement.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.kh.statement.model.dao.StudentDAO;
import com.kh.statement.model.vo.Student;

public class StudentService {
	
	private Connection conn = null;

	public StudentService() {
		this.conn = getConnection();
	}
	
	public List<Student> findAll() {
		
		List<Student> students = new StudentDAO().findAll(conn);

		close(conn);
		
		return students;
		
	}
	
	
	public Student findById(int studentId) {
		
		Student student = new StudentDAO().findById(conn, studentId);
		
		return student;
	}
	
	
	
	public Student findByDomitory() {
		return null;
	}
	
	
	
	public Student findByMajor() {
		return null;
	}
	
	
	public Student findByDormitory() {
		return null;
	}
	
	
	public int updateStudent() {
		return 0;
	}
	
	
	
	public int updateDormitory() {
		return 0;
	}
	
	
	
	public int insert() {
		return 0;
	}
	
	
	
	public int delete() {
		return 0;
	}
	
	
}
