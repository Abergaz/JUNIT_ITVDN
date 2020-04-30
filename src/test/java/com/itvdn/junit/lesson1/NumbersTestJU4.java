package com.itvdn.junit.lesson1;

import org.junit.Test;
import static org.junit.Assert.*;


public class NumbersTestJU4 {
    @Test
    public void sum(){
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected,actual);
    }
}