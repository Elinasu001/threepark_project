package com.kh.statement.model.dao;

import static com.kh.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.statement.model.vo.Student;

public class StudentDAO {
	
	private Properties prop = new Properties();
	
	/**
	 *  도메인, 매핑
	 */
	public StudentDAO() {
		try {
			prop.loadFromXML(new FileInputStream("resources/student-mapper.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public List<Student> findAll(Connection conn) {

		List<Student> students = new ArrayList();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("findAll");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Student student = new Student(rset.getInt("STUDENT_ID"),
											 rset.getString("STUDENT_NAME"),
											 rset.getString("ENROLL_DATE"),
											 rset.getString("MAJOR_NAME"),
											 rset.getString("DORM_NAME"));
				students.add(student);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return students;
	}
	
	
	public Student findById(Connection conn, int studentId) {
		Student student = null;
	  	PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("findById");
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, studentId);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				student = new Student();
				student.setStudentId(rset.getInt("STUDENT_ID"));
				student.setStudentName(rset.getString("STUDENT_NAME"));
				student.setEnrollDate(rset.getString("ENROLL_DATE"));
				student.setMajorName(rset.getString("MAJOR_NAME"));
				student.setDormName(rset.getString("DORM_NAME"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
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
