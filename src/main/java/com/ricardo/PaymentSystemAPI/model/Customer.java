package com.ricardo.PaymentSystemAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Customer extends User {

	@Column(unique = true)
	private int cpf;

	public Customer() {};
	
	public Customer(String name, String email, String password, int cpf) {
		super(name, email, password);
		this.cpf = cpf;
	}
	
	@Override
	public void userTransaction() {
		// TODO Auto-generated method stub
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
