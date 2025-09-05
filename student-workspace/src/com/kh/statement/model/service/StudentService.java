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
		
		Connection conn = getConnection();
		
		List<Student> students = new StudentDAO().findAll(conn);

		close(conn);
		
		return students;
		
	}
	
	
}
