package org.example;

import org.example.calculator.Check;
import org.example.calculator.InvalidExpressionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTest {

    @Test
    void plusNumbersTest(){

        Check check = new Check();
        double nums[] = {2,3};

        assertEquals(5,  check.checker("+", nums));

    }

    @Test
    void minusNumbersTest(){

        Check check = new Check();
        double nums[] = {2,3};

        assertEquals(-1,  check.checker("-", nums));

    }

    @Test
    void multipleNumbersTest(){

        Check check = new Check();
        double nums[] = {2,3};

        assertEquals(6,  check.checker("*", nums));

    }

    @Test
    void cannotDivideWithZeroTest(){

        double nums[] = {3,0};
        assertThrows(InvalidExpressionException.class, () -> new Check().checker("/", nums));

    }

    @Test
    void canDivideTest(){

        Check check = new Check();
        double nums[] = {6,3};

        assertEquals(2,  check.checker("/", nums));

    }

}