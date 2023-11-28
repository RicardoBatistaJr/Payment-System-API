package com.ricardo.PaymentSystemAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class PaymentSystemApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentSystemApiApplication.class, args);
	}
}
