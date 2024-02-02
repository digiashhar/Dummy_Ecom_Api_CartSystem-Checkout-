package com.register.registration.repository;

import com.register.registration.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
    // Additional methods if needed
}
