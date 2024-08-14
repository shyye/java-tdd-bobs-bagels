package com.booleanuk.core;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Basket {
    // TODO: Difference between ArrayList and simple List??
    // TODO: Should this be private?
    HashMap<String, Integer> products;
    int maxCapacity;
    int size = 0;

    public Basket() {
        this.products = new HashMap<>();
        this.maxCapacity = 3;
    }

    public boolean add(String productName) {
        // Check if max capacity
        if (this.size >= maxCapacity) {
            System.out.println("Basket is full, can't add more items.");
            return false;
        }

        // List properties
        int numOfProducts;

        // Update numOfProducts if already exist, otherwise just add
        if (products.containsKey(productName)) {
            numOfProducts = products.get(productName) + 1;
        } else {
            numOfProducts = 1;
        }

        // Add product
        products.put(productName, numOfProducts);

        // Update size
        size++;

        return true;
    }

    public boolean remove(String productName) {

        // Check if product does not exist
        if (!this.products.containsKey(productName)) {
            System.out.println("Product does not exist. Can't remove.");
            return false;
        }

        // Update quantity if already in list
        this.products.put(productName, this.products.get(productName) + 1);

        size--;

        return true;
    }
}
