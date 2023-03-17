package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {

        double result1 = Calculator.add(3.0,2.0);
        double result2 = Calculator.add(3.125,196.394);

        assertEquals(5, result1);
        assertEquals(199.519, result2);

    }

    @Test
    void minus() {

        double result1 = Calculator.minus(3.0,2.0);
        assertEquals(1, result1);

    }

    @Test
    void times() {

        double result1 = Calculator.times(3.0,2.0);
        assertEquals(6, result1);

    }

    @Test
    void divide() {

        double result1 = Calculator.divide(3.0,2.0);
        assertEquals(1.5, result1);

    }

    @Test
    void checkNull(){

        Calculator.calculate('+', 3.0, 5.0);

    }

}