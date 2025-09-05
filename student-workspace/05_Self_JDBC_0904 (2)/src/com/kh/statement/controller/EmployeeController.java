package com.kh.statement.controller;

import java.util.List;

import com.kh.statement.model.service.EmployeeService;
import com.kh.statement.model.vo.Employee;

public class EmployeeController {

public List<Employee> findAll() {
		
	    List<Employee> employee = new EmployeeService().findAll();
		return employee;
	}
public List<Employee> findByDep() {
	
    List<Employee> employee = new EmployeeService().findByDep();
	return employee;
}
	
}
