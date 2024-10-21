package com.ecommerce.krayah.repositories;

import com.ecommerce.krayah.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
