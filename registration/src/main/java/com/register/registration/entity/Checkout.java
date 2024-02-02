package com.register.registration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checkoutId;

    public Long getCheckoutId() {
        return checkoutId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private Long productId;
    private Long userId;

    public void setCheckoutId(Long checkoutId) {
        this.checkoutId = checkoutId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private double totalPrice;

    // Other fields, getters, setters, etc.
}
