package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "2 + 3 doit être 5");
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(4, 5), "4 * 5 doit être 20");
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2), "10 / 2 doit être 5");
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0), "Division par zéro doit lancer une exception");
    }
}
