package com.ricardo.PaymentSystemAPI.service;

import org.springframework.stereotype.Service;

import handler.AuthenticationHandler;

@Service 
public class PaymentService {
	
	AuthenticationHandler handler = new AuthenticationHandler();
	
	public String getTransaction() {
		return handler.getAuthorization();
	}

	public void createTransaction(String sender, String recipient, Double value) {
		
	}
}
