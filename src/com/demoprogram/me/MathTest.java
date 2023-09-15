package com.demoprogram.me;

import org.junit.jupiter.api.Test;

import static com.demoprogram.me.Main.mathFunction;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    public void testAddition() {
        assertEquals("+", mathFunction(1, 2, 3));
        assertEquals("+*", mathFunction(2, 2, 4));
    }

    @Test
    public void testSubtraction() {
        assertEquals("-", mathFunction(1, 2, -1));
    }

    @Test
    public void testMultiplication() {
        assertEquals("*", mathFunction(3, -3, -9));
    }

    @Test
    public void testDivision() {
        assertEquals("/", mathFunction(3, 3, 1));
    }

    @Test
    public void testNone() {
        assertEquals("None", mathFunction(7, 1, 11));
    }
}
