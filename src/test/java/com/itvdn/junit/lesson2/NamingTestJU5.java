package com.itvdn.junit.lesson2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NamingTestJU5 {
    private Naming naming = new Naming();

    @Test
    void isAdult_AgeLessThan18_False() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void isAdult_False_AgeLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void testIsNotAnAdultIfAgeLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void IsNotAnAdultIfAgeLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void should_ReturnFalse_When_AgeLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void When_AgeLessThan18_Expect_isAdultAsFalse() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void given_TryToBuayACigarette_When_AgeLessThan18_Expect_isAdultAsFalse() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
}