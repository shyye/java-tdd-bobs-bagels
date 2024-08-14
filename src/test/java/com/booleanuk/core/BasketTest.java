package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class BasketTest {

    // User story 1.
    @Test
    public void add() {
        Basket basket = new Basket();

        // Return true if sucessfully added
        Assertions.assertTrue(basket.add("Unicorn Bagel"));
        // Product has been added to list
        Assertions.assertEquals(1, basket.products.size());
    }
}
