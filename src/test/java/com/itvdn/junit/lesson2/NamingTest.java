package com.itvdn.junit.lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NamingTest {
    private Naming naming = new Naming();

    @Test
    public void isAdult_AgeLessThan18_False(){
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void isAdult_False_AgeLessThan18(){
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void testIsNotAnAdultIfAgeLessThan18(){
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void IsNotAnAdultIfAgeLessThan18(){
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void should_ReturnFalse_When_AgeLessThan18(){
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void When_AgeLessThan18_Expect_isAdultAsFalse(){
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void given_TryToBuayACigarette_When_AgeLessThan18_Expect_isAdultAsFalse(){
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
}