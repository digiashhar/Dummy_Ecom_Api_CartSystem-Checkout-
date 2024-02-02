package com.register.registration.Service.ServiceImpl;

import com.register.registration.entity.Checkout;
import com.register.registration.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    @Autowired
    private CartService cartService;

    @Autowired
    private CheckoutRepository checkoutRepository;

    public Checkout processCheckout(Long userId, double totalPrice) {
        Checkout checkout = new Checkout();
        checkout.setUserId(userId);
        checkout.setTotalPrice(totalPrice);

        // Additional logic if needed

        return checkoutRepository.save(checkout);
    }


    // Example Checkout Service method
    public void performCheckout(Long userId, Long productId, double totalPrice) {
        Checkout checkout = new Checkout();
        checkout.setUserId(userId);
        checkout.setProductId(productId);  // Set the product ID
        checkout.setTotalPrice(totalPrice);

        // Save the checkout entity to the database
        checkoutRepository.save(checkout);

        // Display the checkout message
        displayCheckoutMessage(checkout);
    }

    // Display Checkout Message
    private void displayCheckoutMessage(Checkout checkout) {
        // You can use any logging mechanism or display on the UI
        System.out.println("Checkout details - User ID: " + checkout.getUserId() +
                ", Product ID: " + checkout.getProductId() +
                ", Total Price: " + checkout.getTotalPrice());
    }

    public double calculateTotalPrice(Long userId) {
        return cartService.getTotalCartCost(userId);
    }
}
