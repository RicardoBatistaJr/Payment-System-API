package com.ricardo.PaymentSystemAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ricardo.PaymentSystemAPI.repository.CustomerRepository;
import com.ricardo.PaymentSystemAPI.repository.StorekeeperRepository;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.AcceptAnyValidator;
import handler.AuthenticationHandler;


@Service 
public class PaymentService {
	
	AuthenticationHandler handler = new AuthenticationHandler();
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	StorekeeperRepository storekeeperRepository;
	
	public String getTransaction() {
		return handler.getAuthorization();
	}

	@Transactional
	public void sendTransaction(String sender, String recipient, Double value){	
		
		if(validIdentifierCode(sender)==true && checkType(sender) == "CPF" && validIdentifierCode(sender)==true && checkType(recipient) == "CPF") {
			sendTransactionToConsumer();
		}else {
			if(validIdentifierCode(sender)==true && checkType(sender) == "CPF" && validIdentifierCode(sender)==true && checkType(recipient) == "CNPJ") {
				sendTransactionToStorekeeper();
			}
		}

	}
	
    private void sendTransactionToStorekeeper() {
    	System.out.println("Transação feita pro lojista");
	}

	private void sendTransactionToConsumer() {
    	System.out.println("Transação feita pro consumidor");
	}

	public static String removeSpecialCharacters(String input) {
        return input.replaceAll("[^0-9]", "");
    }
    
    public String checkType(String id) {
    	String value = removeSpecialCharacters(id);
    	if(validIdentifierCode(value) == true) {
    		if(id.length() == 11) {
    			return "CPF";
    		} else {
    			return "CNPJ";
    		} 
    	}
    	return "INVALID";
    }
    
	public boolean validIdentifierCode(String id) {
		AcceptAnyValidator validator;
		String identifier = removeSpecialCharacters(id);
		
		validator = new AcceptAnyValidator(false, AcceptAnyValidator.Documento.CNPJ, AcceptAnyValidator.Documento.CPF);
		List<ValidationMessage> errors = validator.invalidMessagesFor(identifier);
		if(errors.size() > 0) {
			System.out.println("ERRO: " + errors.get(0).getMessage()); 
			return false;
		} return true;
	}
}
