package com.ricardo.PaymentSystemAPI.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Storekeeper extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cnpj", unique = true)
	@Id
	private String cnpj;
	
	public Storekeeper() {
		super();
	};
	
	public Storekeeper(String name, String email, String password, String cnpj) {
		super(name, email, password);
		this.cnpj = cnpj;
	}
	@Override
	public void userTransaction() {
		// TODO Auto-generated method stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
