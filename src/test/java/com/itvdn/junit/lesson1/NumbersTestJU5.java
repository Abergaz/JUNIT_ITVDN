package com.itvdn.junit.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumbersTestJU5 {
    @Test
    void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}