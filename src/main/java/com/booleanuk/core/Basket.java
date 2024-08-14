package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {
    // TODO: Difference between ArrayList and simple List??
    HashMap<String, ArrayList<Integer>> products = new HashMap<>();
    int maxCapacity = 3;

    public boolean add(String product) {
        return false;
    }
}
