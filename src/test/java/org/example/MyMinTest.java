package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMinTest {

    @Test
    public void testPositive() {
        int out = MyMin.min(1, 2);
        assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = MyMin.min(-1, -2);
        assertEquals(-2, out);
    }
}