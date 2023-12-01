package com.ricardo.PaymentSystemAPI.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="customer")
public class Customer extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="cpf", unique = true)
	@Id
	private String cpf;
	
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wallet_id", referencedColumnName = "id")
    private Wallet wallet;

	public Customer() {};
	
	public Customer(String name, String email, String password, String cpf) {
		super(name, email, password);
		this.cpf = cpf;
	}
	
	public void userTransaction() {
		// TODO Auto-generated method stub
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	
}
