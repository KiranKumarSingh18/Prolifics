package com.kks.bootdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name="emp_id")
	private int employeeId;
	
	@Column(name="emp_name")
	private String employeeName;
	
	@Column(name="emp_sal")
	private double salary;
	
	@Column(name="deptno")
	private int departmentNo;
	
	public Employee() {}

	public Employee(int employeeId, String employeeName, double salary, int departmentNo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.departmentNo = departmentNo;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	
}
