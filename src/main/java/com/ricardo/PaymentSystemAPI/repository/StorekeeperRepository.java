package com.ricardo.PaymentSystemAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.PaymentSystemAPI.model.Storekeeper;

@Repository
public interface StorekeeperRepository extends JpaRepository<Storekeeper, String> {
}
