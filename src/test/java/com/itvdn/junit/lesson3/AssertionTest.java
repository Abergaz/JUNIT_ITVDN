package com.itvdn.junit.lesson3;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AssertionTest {

    @Test
    public void whenAssertionEquality_thenEqual() {
        String actual = "ITVDN";
        String expected = "ITVDN";
        String message = "Expected and actual not equal";
        assertEquals(message, expected, actual);
    }

    @Test
    public void whenAssertionDoubleEquality_thenEqual() {
        double actual = 0.34;
        double expected = 0.33;
        double delta = 0.09;
        String message = "The difference between expected and actual more them " + delta;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenAssertionArrayEquality_thenEqual() {
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenNullArrays_whenAssertionArraysEquality_thenEqual() {
        int[] actual = null;
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenAssertionNull_thenTrue() {
        Object tested = null;
        assertNull("Tested object should be null", tested);
    }

    @Test
    public void whenAssertionNotNull_thenTrue() {
        Object tested = new Object();
        assertNotNull("Tested object should be not null", tested);
    }

    @Test
    public void whenAssertionNotSameObject_thenDiffenet() {
        Object cat = new Object();
        Object dog = new Object();
        assertNotSame(cat, dog);
    }

    @Test
    public void whenAssertionSameObject_thenNotDiffenet() {
        String actual = "Test";
        String expected = new String("Test").intern();
        assertSame(expected, actual);
    }
    @Test
    public void whenAssertionConditions_thenVerify(){
      assertTrue("5 in not greater then 5", 5>4);
      assertFalse("5 is not geater then 6",5>6);
    }

    @Test
    public void whenCheckingExceptionMessage_thenEqual(){
        try {
            methodThatShouldThrowException();
            fail("Exception not thrown");
        }catch (UnsupportedOperationException e){
           String expected="Operation not supported";
            assertEquals(expected,e.getMessage());
        }
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Test
    public void  testAssertThatHasItems(){
        List<String> list = Arrays.asList("Java","Kotlin","Scala");
        assertThat(list, CoreMatchers.hasItems("Java","Kotlin"));
    }

}