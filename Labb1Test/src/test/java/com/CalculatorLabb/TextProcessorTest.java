package com.CalculatorLabb;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class TextProcessorTest {


    @Test
    public void testReverse(){
    assertEquals("olleh", TextProcessor.reverse("hello"));
    }
    @DisplayName("Display Name test")
    @Test
    public void testLowerCase(){
        assertEquals("hello", TextProcessor.lowerCase("hello"));
    }

    public void testUpperCase(){
        assertEquals("hello", TextProcessor.lowerCase("hello"));
    }

    @Test
    public void testAssertFalse(){
        assertTrue(7 < 9);
    }

    @Test
    public void testAssertNull(){
        String nullString = null;
        assertNull(nullString);

    }

}
