package com.example.sweetimp.controller;

import com.example.sweetimp.model.Cart;
import com.example.sweetimp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin
public class CartController {

    @Autowired
    private CartService service;

    @GetMapping
    public Cart cart() {
        return service.getCart();
    }

    @PostMapping("/add")
    public void add(@RequestParam Long productId,
                    @RequestParam int qty) {
        service.add(productId, qty);
    }
}
