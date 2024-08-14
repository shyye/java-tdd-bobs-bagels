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

    @Test
    public void remove() {
        Basket basket = new Basket();
        basket.add("Small Bagel");
        basket.add("Small Bagel");

        // Remove first item, 1 left
        Assertions.assertTrue(basket.remove("Small Bagel"));
        Assertions.assertEquals(1, basket.products.get("Small Bagel").get(0));

        // Remove second item, 0 left (should be removed from list)
        Assertions.assertTrue(basket.remove("Small Bagel"));
        Assertions.assertFalse(basket.products.containsKey("Small Bagel"));

        // Remove not existing item
        Assertions.assertFalse(basket.remove("Small Bagel"));
    }
}
