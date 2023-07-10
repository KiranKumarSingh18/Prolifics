package com.kiran.model;

public class Department {
	private int departmentNo;
	private String name;
	private String location;
	Employee[] employee;
	public Department() { }
	public Department(int departmentNo, String name, String location, Employee[] employee) {
		super();
		this.departmentNo = departmentNo;
		this.name = name;
		this.location = location;
		this.employee = employee;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee[] getEmployee() {
		return employee;
	}
	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
	
}
