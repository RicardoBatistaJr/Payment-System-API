package com.ricardo.PaymentSystemAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.PaymentSystemAPI.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
