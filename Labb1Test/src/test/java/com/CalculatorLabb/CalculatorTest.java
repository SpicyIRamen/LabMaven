package com.CalculatorLabb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;



class Calculator {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.addition(2,2));
    }
}