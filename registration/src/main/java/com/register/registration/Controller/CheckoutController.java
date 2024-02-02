package com.register.registration.Controller;

import com.register.registration.Service.ServiceImpl.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService checkoutService;

    @PostMapping("/processCheckout")
    public ResponseEntity<String> processCheckout(@RequestParam Long userId, @RequestParam Long productId, @RequestParam double totalPrice) {
        checkoutService.performCheckout(userId, productId, totalPrice);
        return ResponseEntity.ok("Checkout successful!");  // You can customize the success message
    }

    @GetMapping("/totalPrice/user={userId}")
    public ResponseEntity<Double> calculateTotalPrice(@PathVariable Long userId) {
        double totalPrice = checkoutService.calculateTotalPrice(userId);
        return ResponseEntity.ok(totalPrice);
    }
}