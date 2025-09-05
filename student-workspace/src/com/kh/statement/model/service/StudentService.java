package com.kh.statement.model.service;

import java.sql.Connection;
import java.util.List;

import com.kh.common.Template;
import com.kh.statement.model.dao.StudentDAO;
import com.kh.statement.model.vo.Student;

public class StudentService {

	public List<Student> findAll() {
		Connection conn = Template.getConnection();
		
		List<Student> students = new StudentDAO().findAll(conn);

		Template.close(conn);
		return students;
		
	}
	
	
}
