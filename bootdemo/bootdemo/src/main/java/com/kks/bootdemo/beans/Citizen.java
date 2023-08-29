package com.kks.bootdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Citizen {
	
	@Autowired
	Aadhar aadhar;
	
	private long mobile = 8328319281L;
	private int age = 21;
	
	public Citizen() {}

	public Citizen(Aadhar aadhar, long mobile, int age) {
		super();
		this.aadhar = aadhar;
		this.mobile = mobile;
		this.age = age;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
