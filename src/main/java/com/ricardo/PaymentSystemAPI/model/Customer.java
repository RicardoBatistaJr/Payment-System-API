package com.ricardo.PaymentSystemAPI.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="cpf", unique = true)
	@Id
	private String cpf;
	
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
    private Wallet wallet;

	public Customer() {};
	
	public Customer(String name, String email, String password, String cpf) {
		super(name, email, password);
		this.cpf = cpf;
	}
	
	@Override
	public void userTransaction() {
		// TODO Auto-generated method stub
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
