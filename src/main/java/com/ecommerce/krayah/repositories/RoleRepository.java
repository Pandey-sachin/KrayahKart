package com.ecommerce.krayah.repositories;

import com.ecommerce.krayah.model.AppRole;
import com.ecommerce.krayah.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
