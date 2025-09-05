package com.kh.statement.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.common.Template;
import com.kh.statement.model.vo.Employee;

public class EmployeeDao {

	public List<Employee> findAll(Connection conn) {
		// 0) 필요한 변수 선언

		List<Employee> employees = new ArrayList();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Properties prop = new Properties();

		// 1), 2) 완료
		// 3_1) PreparedStatement -> 이 SQL문은 완성문이므로 보완 불필요
		try {
			prop.loadFromXML(new FileInputStream("resources/employee-mapper.xml"));
			String sql = prop.getProperty("findAll");
			pstmt = conn.prepareStatement(sql);
			// 4), 5) SQL문 실행 후 결과 받기
			rset = pstmt.executeQuery();
			// 6) 조회결과 여부 판단 후 컬럼값을 객체 필드에 매핑
			while (rset.next()) {
				Employee employee = new Employee(rset.getInt("EMP_ID"), 
												 rset.getString("EMP_NAME"),
												 rset.getInt("SALARY"), 
												 rset.getString("DEPT_TITLE"), 
												 rset.getString("JOB_NAME"));
				employees.add(employee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 7) 사용이 끝난 JDBC 객체 자원반납
			Template.close(rset);
			Template.close(pstmt);
		}

		// 8) 결과 반환
		return employees;
	}

}
