package com.kh.statement.model.vo;

import java.sql.Date;
import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private String depTitle;
	private String posName;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int salary, String depTitle, String posName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.depTitle = depTitle;
		this.posName = posName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepTitle() {
		return depTitle;
	}
	public void setDepTitle(String depTitle) {
		this.depTitle = depTitle;
	}
	public String getPosName() {
		return posName;
	}
	public void setPosName(String posName) {
		this.posName = posName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", depTitle=" + depTitle
				+ ", posName=" + posName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(depTitle, empName, empId, posName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(depTitle, other.depTitle) && Objects.equals(empName, other.empName)
				&& empId == other.empId && Objects.equals(posName, other.posName)
				&& Objects.equals(salary, other.salary);
	}
	
	
	
	
	
}