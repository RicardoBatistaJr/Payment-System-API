package com.ricardo.PaymentSystemAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wallet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double money;
	
//    @OneToOne
//    @JoinColumn(name = "user_id", unique = true)
//    private User customer;
	
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
