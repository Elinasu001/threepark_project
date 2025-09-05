package com.kh.statement.model.vo;

import java.util.Objects;

public class Student {

	private int studentId;
	private String studentName;
	private String birthDate;
	private char gender;
	private String enrollDate;
	private int majorId;
	private int dormId;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String birthDate, char gender, String enrollDate, int majorId,
			int dormId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.enrollDate = enrollDate;
		this.majorId = majorId;
		this.dormId = dormId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", enrollDate=" + enrollDate + ", majorId=" + majorId + ", dormId=" + dormId
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(birthDate, dormId, enrollDate, gender, majorId, studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(birthDate, other.birthDate) && dormId == other.dormId
				&& Objects.equals(enrollDate, other.enrollDate) && gender == other.gender && majorId == other.majorId
				&& studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
	
}
