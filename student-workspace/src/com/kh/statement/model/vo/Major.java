package com.kh.statement.model.vo;

import java.util.Objects;

public class Major {
	private int majorId;
	private String majorName;
	private String departmentName;
	private int creditHours;
	public Major() {
		super();
	}

	public Major(int majorId, String majorName, String departmentName, int creditHours) {
		super();
		this.majorId = majorId;
		this.majorName = majorName;
		this.departmentName = departmentName;
		this.creditHours = creditHours;
	}

	public int getMajorId() {
		return majorId;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(creditHours, departmentName, majorId, majorName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Major other = (Major) obj;
		return creditHours == other.creditHours && Objects.equals(departmentName, other.departmentName)
				&& majorId == other.majorId && Objects.equals(majorName, other.majorName);
	}
	
	
	
}
