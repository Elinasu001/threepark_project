package com.kh.statement.controller;

import java.util.List;

import com.kh.statement.model.service.StudentService;
import com.kh.statement.model.vo.Student;


public class StudentController {

	public List<Student> findAll() {
	    List<Student> students = new StudentService().findAll();
		return students;
	}
	
	
	
	public Student findById(int studentId) {
		Student student = new StudentService().findById(studentId);
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
