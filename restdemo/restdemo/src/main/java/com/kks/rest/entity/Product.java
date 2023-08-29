package com.kks.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@Column(name="pro_id")
	private String productId;
	
	@Column(name="pro_name")
	private String productName;
	
	@Column(name="pro_category")
	private String productCategory;
	
	private double price;
	
	public Product() {}

	public Product(String productId, String productName, String productCategory, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
