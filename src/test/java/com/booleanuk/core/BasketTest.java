package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {

    // User story 1.
    @Test
    public void add() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Unicorn Bagel"));
    }
}
