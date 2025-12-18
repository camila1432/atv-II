package com.example.sweetimp.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(Product product, int qty) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.setQuantity(item.getQuantity() + qty);
                return;
            }
        }
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(qty);
        items.add(item);
    }

    public List<CartItem> getItems() {
        return items;
    }
}

