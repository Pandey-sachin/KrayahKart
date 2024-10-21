package com.ecommerce.krayah.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.krayah.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}