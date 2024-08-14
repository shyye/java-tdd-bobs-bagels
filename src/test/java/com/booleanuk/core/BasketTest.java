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
        Assertions.assertTrue(basket.add("Unicorn Bagel"));
        Assertions.assertEquals(1, basket.size);

        basket.add("Unicorn Bagel");
        Assertions.assertEquals(2, basket.products.get("Unicorn Bagel").get(0));    // Index 0 is numOfProducts

        basket.add("Sunhaven Bagel");
        Assertions.assertFalse(basket.add("Moon Bagel"));    // Exceed maxCapacity
    }

//    @Test
//    public void remove() {
//        Basket basket = new Basket();
//
//    }
}
