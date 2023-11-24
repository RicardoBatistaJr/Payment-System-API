package com.ricardo.PaymentSystemAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Wallet {
	
	private double money;
	@OneToOne
	private User user;
	
	public Wallet() {
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
