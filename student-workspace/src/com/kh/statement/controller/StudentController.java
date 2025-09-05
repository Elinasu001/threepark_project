package com.kh.statement.controller;

import java.util.List;

import com.kh.statement.model.service.StudentService;
import com.kh.statement.model.vo.Student;


public class StudentController {

	public List<Student> findAll() {
	    List<Student> student = new StudentService().findAll();
		return student;
	}

	
}
