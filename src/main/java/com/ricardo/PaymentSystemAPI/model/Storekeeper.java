package com.ricardo.PaymentSystemAPI.model;

import java.io.Serializable;
import java.util.List;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CNPJValidator;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="storekeeper")
public class Storekeeper extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cnpj", unique = true)
	@Id
	private String cnpj;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wallet_id", referencedColumnName = "id")
    private Wallet wallet;
	
	public Storekeeper() {
		super();
	};
	
	public Storekeeper(String name, String email, String password, String cnpj) {
		super(name, email, password);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean validIndifierCode(String id) {
		CNPJValidator cnpjValidator = new CNPJValidator();
		List<ValidationMessage> errors = cnpjValidator.invalidMessagesFor(id);
		return false;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	

}
