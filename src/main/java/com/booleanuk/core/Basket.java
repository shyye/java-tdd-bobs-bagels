package com.booleanuk.core;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Basket {
    // TODO: Difference between ArrayList and simple List??
    // TODO: Should this be private?
    HashMap<String, ArrayList<Integer>> products;
    int maxCapacity;

    public Basket() {
        this.products = new HashMap<>();
        this.maxCapacity = 3;
    }

    public boolean add(String product) {
        // Check if max capacity
        if (products.size() >= maxCapacity) {
            System.out.println("Basket is full, can't add more items.");
            return false;
        }

        // List properties
        ArrayList<Integer> details = new ArrayList<>();
        int numOfProducts;
        int price = 0;  // TODO: Placehlder value

        // Update numOfProducts if already exist, otherwise just add
        if (products.containsKey(product)) {
            int previousNumOfProducts = products.get(product).get(0);   // Index 0 is numOfProduct, Index 1 is price
            numOfProducts = previousNumOfProducts += 1;
        } else {
            numOfProducts = 1;
        }

        // Add product details
        details.add(numOfProducts);
        details.add(price);

        // Add product
        products.put(product, details);
        return true;
    }
}
