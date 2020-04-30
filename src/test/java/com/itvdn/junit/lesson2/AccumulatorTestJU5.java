package com.itvdn.junit.lesson2;


import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class AccumulatorTestJU5 {
    private static int number = 10;
    private Accumulator accumulator;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("After class");
    }

    @BeforeEach
    void before() {
        System.out.println("Before method");
        accumulator = new Accumulator();
    }

    @AfterEach
    void after() {
        System.out.println("after method");
    }

    @Test
    void accumulate() {
        System.out.println("Accumulate test");
        accumulator.accumulate(number);
        accumulator.accumulate(number * 2);
        int actual = accumulator.getCounter();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
   // @Disabled("Tested is acuumulate method")
    void getCounter() {
        System.out.println("Get counter test");
        accumulator.accumulate(10);
        int actual = accumulator.getCounter();
        int expected = 10;
        assertEquals(expected, actual);
    }
}