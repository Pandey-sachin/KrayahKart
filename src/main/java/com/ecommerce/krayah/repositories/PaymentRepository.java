package com.ecommerce.krayah.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.krayah.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}