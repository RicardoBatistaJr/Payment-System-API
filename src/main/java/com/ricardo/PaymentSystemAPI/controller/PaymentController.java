package com.ricardo.PaymentSystemAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.PaymentSystemAPI.service.PaymentService;

import handler.AuthenticationHandler;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	

	
	@PostMapping(value = "/transaction")
	@ResponseStatus(HttpStatus.OK)
	String transaction(@RequestParam ("value") double value,
							@RequestParam ("sender") String sender,
							@RequestParam ("recipient") String recipient) {
		
		return service.getTransaction();
		
	};
	
	@GetMapping(value = "/gettransaction")
	@ResponseStatus(HttpStatus.OK)
	String getTtransaction() {
		return service.getTransaction();	
	};
}
