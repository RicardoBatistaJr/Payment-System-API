package com.ricardo.PaymentSystemAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Wallet {
	
	@Id
	private Long id;
	private double money;
	
    @OneToOne
    @JoinColumn(name = "customer_id", unique = true)
    private Customer customer;
	
	public Wallet() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public double getMoney() {
		return money;
	}
	

	
	
}
