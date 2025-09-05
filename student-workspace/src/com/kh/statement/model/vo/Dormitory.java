package com.kh.statement.model.vo;

import java.util.Objects;

public class Dormitory {
	private int dormId;
	private String dormName;
	private String dormLocation;
	private String dormLeader;
	public Dormitory() {
		super();
	}
	public Dormitory(int dormId, String dormName, String dormLocation, String dormLeader) {
		super();
		this.dormId = dormId;
		this.dormName = dormName;
		this.dormLocation = dormLocation;
		this.dormLeader = dormLeader;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
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
	@Override
	public int hashCode() {
		return Objects.hash(dormId, dormLeader, dormLocation, dormName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dormitory other = (Dormitory) obj;
		return dormId == other.dormId && Objects.equals(dormLeader, other.dormLeader)
				&& Objects.equals(dormLocation, other.dormLocation) && Objects.equals(dormName, other.dormName);
	}
	
}
