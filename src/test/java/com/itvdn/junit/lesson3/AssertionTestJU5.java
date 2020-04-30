package com.itvdn.junit.lesson3;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


public class AssertionTestJU5 {

    @Test
    void whenAssertionEquality_thenEqual() {
        String actual = "ITVDN";
        String expected = "ITVDN";
        String message = "Expected and actual not equal";
        assertEquals(expected, actual, message);
    }

    @Test
    void whenAssertionDoubleEquality_thenEqual() {
        double actual = 0.34;
        double expected = 0.33;
        double delta = 0.09;
        String message = "The difference between expected and actual more them " + delta;
        assertEquals(expected, actual, delta, message);
    }

    @Test
    void whenAssertionArrayEquality_thenEqual() {
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenNullArrays_whenAssertionArraysEquality_thenEqual() {
        int[] actual = null;
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenAssertionNull_thenTrue() {
        Object tested = null;
        assertNull(tested, "Tested object should be null");
    }

    @Test
    void whenAssertionNotNull_thenTrue() {
        Object tested = new Object();
        assertNotNull(tested, "Tested object should be not null");
    }

    @Test
    void whenAssertionNotSameObject_thenDiffenet() {
        Object cat = new Object();
        Object dog = new Object();
        assertNotSame(cat, dog);
    }

    @Test
    void whenAssertionSameObject_thenNotDiffenet() {
        String actual = "Test";
        String expected = new String("Test").intern();
        assertSame(expected, actual);
    }

    @Test
    void whenAssertionConditions_thenVerify() {
        assertTrue(5 > 4, "5 in not greater then 5");
        assertFalse(5 > 6, "5 is not geater then 6");
    }

    @Test
    void whenCheckingExceptionMessage_thenEqual() {
        UnsupportedOperationException exception = assertThrows(
                UnsupportedOperationException.class,
                this::methodThatShouldThrowException,
                "Exception not thrown");
        String expected = "Operation not supported";
        assertEquals(expected, exception.getMessage());
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Test
    void testAssertThatHasItems() {
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        assertThat(list, CoreMatchers.hasItems("Java", "Kotlin"));
    }

}