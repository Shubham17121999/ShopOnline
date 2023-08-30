package com.masai.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable {

	private String username;
	private String email;
	private int productId;
	private String productName;
	private int qty;
	private double price;
	private double total;
	private LocalDate dt;
	
	public Transaction() {
		
	}


	public String getpName() {
		return productName;
	}


	public void setpName(String pName) {
		this.productName = productName;
	}


	public Transaction(String username, String email, int productId, String productName, int qty, double price, double total,
			LocalDate dt) {
		super();
		this.username = username;
		this.email = email;
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
		this.total = total;
		this.dt = dt;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}


	@Override
	public String toString() {
		return "Transaction [username=" + username + ", email=" + email + ", productId=" + productId + ", pName="
				+ productName + ", qty=" + qty + ", price=" + price + ", total=" + total + ", dt=" + dt + "]";
	}


	
	
	
	
}
