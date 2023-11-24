package com.ricardo.PaymentSystemAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;

public abstract class User {
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	@OneToOne
	Wallet wallet;
	
	public User() {};
	
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public abstract void userTransaction();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
