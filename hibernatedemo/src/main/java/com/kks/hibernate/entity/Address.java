package com.kks.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address 
{
	@Id
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="hno")
	private String houseNo;
	
	@Column(name="street")
	private String streetname;
	
	@Column(name="city")
	private String cityName;
	@Column(name="state")
	private String stateName;
	
	@OneToOne(mappedBy="address")
	Person person;
	
	
	public Address() {}

	public Address(int addressId, String houseNo, String streetname,String cityName, String stateName) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.streetname = streetname;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
