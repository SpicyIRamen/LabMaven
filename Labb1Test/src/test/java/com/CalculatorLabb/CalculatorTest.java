package com.CalculatorLabb;

import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }
    @RepeatedTest(2)
    void testSub() {
        Calculator calculator = new Calculator();
        assertNotEquals(2, calculator.sub(2,2));
    }
    @Disabled
    void testMult() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.mult(2,2));
    }
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(2,2));
    }
    @AfterEach
    public void textAfterEach(){
        System.out.println("Message After Each Test");
    }
    @BeforeEach
    public void textBeforeEach(){
        System.out.println("Message Before Each Test");
    }
}