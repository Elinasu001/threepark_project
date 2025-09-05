package com.kh.statement.model.vo;

import java.util.Objects;

public class Student {

	// STUDENTS 테이블 정보 : 
	private int studentId;
	private String studentName;
	private String birthDate;
	private String gender;
	private String enrollDate;
	private int majorId;
	private int dormId;
	
	// MAJOR 테이블 정보 :
	private String majorName;
	private String departmentName;
	private int creditHours;
	
	// DORMITORY 테이블 정보 : 
	private String dormName;
	private String dormLocation;
	private String dormLeader;
	
	public Student() {
		super();
	}
	
	/*public Student(int studentId, String studentName, String birthDate, String gender, String enrollDate, int majorId,
			int dormId, String majorName, String departmentName, int creditHours, String dormName, String dormLocation,
			String dormLeader) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.enrollDate = enrollDate;
		this.majorId = majorId;
		this.dormId = dormId;
		this.majorName = majorName;
		this.departmentName = departmentName;
		this.creditHours = creditHours;
		this.dormName = dormName;
		this.dormLocation = dormLocation;
		this.dormLeader = dormLeader;
	}
	*/

	// MAJOR
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	
	// DORMITORY
	public String getDormName() {
		return dormName;
	}
	public void setDormName(String dormName) {
		this.dormName = dormName;
	}
	public String getDormLocation() {
		return dormLocation;
	}
	public void setDormLocation(String dormLocation) {
		this.dormLocation = dormLocation;
	}
	public String getDormLeader() {
		return dormLeader;
	}
	public void setDormLeader(String dormLeader) {
		this.dormLeader = dormLeader;
	}

	// STUDENTS
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
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
