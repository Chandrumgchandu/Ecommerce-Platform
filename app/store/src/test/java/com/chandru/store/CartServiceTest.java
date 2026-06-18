package com.chandru.store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartServiceTest {

    @Test
    void shouldAddQuantityCorrectly() {

        CartService service = new CartService();

        int result = service.addQuantity(2, 3);

        assertEquals(5, result);
    }
}