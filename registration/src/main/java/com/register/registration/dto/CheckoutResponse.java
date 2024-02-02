package com.register.registration.dto;
public class CheckoutResponse {

    private double totalPrice;

    public CheckoutResponse(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
