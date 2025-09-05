package com.kh.statement.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.common.Template;
import com.kh.statement.model.vo.Student;

public class StudentDAO {

	public List<Student> findAll(Connection conn) {
	

		List<Student> students = new ArrayList();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Properties prop = new Properties();

		try {
			prop.loadFromXML(new FileInputStream("resources/student-mapper.xml"));
			String sql = prop.getProperty("findAll");
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				Student student = new Student(rset.getInt("STUDENT_ID"), 
												 rset.getString("STUDENT_NAME"),
												 rset.getString("BIRTH_DATE"), 
												 rset.getChar("GENDER"), // character형 처리 미숙 ㅠ 
												 rset.getString("ENROLL_DATE"),
												 rset.getInt("MAJOR_ID"),
												 rset.getInt("DORM_ID"));
				students.add(student);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Template.close(rset);
			Template.close(pstmt);
		}

		return students;
	}

	
	
}
