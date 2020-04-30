package com.itvdn.junit.lesson2;

import org.junit.*;

import static org.junit.Assert.*;

public class AccumulatorTestJU4 {
    private static int number=10;
    private Accumulator accumulator;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @Before
    public void before(){
        System.out.println("Before method");
        accumulator = new Accumulator();
    }

    @After
    public void after(){
        System.out.println("after method");
    }

    @Test
    public void accumulate() {
        System.out.println("Accumulate test");
        accumulator.accumulate(number);
        accumulator.accumulate(number*2);
        int actual = accumulator.getCounter();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    @Ignore("Tested is acuumulate method")
    public void getCounter() {
        System.out.println("Get counter test");
        accumulator.accumulate(10);
        int actual = accumulator.getCounter();
        int expected = 10;
        assertEquals(expected, actual);
    }
}