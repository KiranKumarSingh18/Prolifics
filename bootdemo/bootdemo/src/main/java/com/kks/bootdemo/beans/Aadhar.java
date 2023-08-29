package com.kks.bootdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Aadhar {
	private long aadharId = 1234567890L;
	private String name = "Kiran Kumar Singh";
	private String gender = "M";
	private String dob = "18-04-2002";
	
	public Aadhar() {}

	public Aadhar(long aadharId, String name, String gender, String dob) {
		super();
		this.aadharId = aadharId;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	public long getAadharId() {
		return aadharId;
	}

	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
