package com.ricardo.PaymentSystemAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Storekeeper extends User{

	@Column(unique = true)
	private int cnpj;
	
	public Storekeeper() {
		super();
	};
	
	public Storekeeper(String name, String email, String password,int cnpj) {
		super(name, email, password);
		this.cnpj = cnpj;
	}
	@Override
	public void userTransaction() {
		// TODO Auto-generated method stub
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
