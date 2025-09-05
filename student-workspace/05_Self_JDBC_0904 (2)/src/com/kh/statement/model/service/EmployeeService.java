package com.kh.statement.model.service;

import java.sql.Connection;
import java.util.List;

import com.kh.common.Template;
import com.kh.statement.model.dao.EmployeeDao;
import com.kh.statement.model.vo.Employee;

public class EmployeeService {

	public List<Employee> findAll() {
		// 1) Connection 객체 생성
		Connection conn = Template.getConnection();
		
		// 2) DAO 호출해서 반환받기
		// Service에서 받아온 Connection 넘겨주기 + 만약 Controller가 넘겨준 값이 있다면 같이 넘겨줄 것
		List<Employee> employees = new EmployeeDao().findAll(conn);
		// 3) Connection 반납
		Template.close(conn);
		// 4) 결과반환
		return employees;
		
	}
	
	public List<Employee> findByDep() {
		// 1) Connection 객체 생성
		Connection conn = Template.getConnection();
		
		// 2) DAO 호출해서 반환받기
		// Service에서 받아온 Connection 넘겨주기 + 만약 Controller가 넘겨준 값이 있다면 같이 넘겨줄 것
		List<Employee> employees = new EmployeeDao().findByDep(conn);
		// 3) Connection 반납
		Template.close(conn);
		// 4) 결과반환
		return employees;
		
	}
	
}
