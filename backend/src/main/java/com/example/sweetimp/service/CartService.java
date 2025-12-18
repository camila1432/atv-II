package com.example.sweetimp.service;

import com.example.sweetimp.model.Cart;
import com.example.sweetimp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private Cart cart = new Cart();

    @Autowired
    private ProductService productService;

    public Cart getCart() {
        return cart;
    }

    public void add(Long productId, int qty) {
        Product product = productService.findById(productId);
        if (product != null) {
            cart.add(product, qty);
        }
    }
}
