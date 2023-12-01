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

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping(value = "/transaction")
	@ResponseStatus(HttpStatus.OK)
	void transaction(@RequestParam ("sender") String sender,
							@RequestParam ("recipient") String recipient,
							@RequestParam ("value") double value) {
		
		service.sendTransaction(sender, recipient, value);
		
	};
	
	@GetMapping(value = "/gettransaction")
	@ResponseStatus(HttpStatus.OK)
	String getTtransaction() {
		return service.getTransaction();	
	};
}
