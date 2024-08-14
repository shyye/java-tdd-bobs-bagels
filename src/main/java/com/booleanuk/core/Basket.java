package com.booleanuk.core;


import java.util.ArrayList;
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
        return true;
    }
}
