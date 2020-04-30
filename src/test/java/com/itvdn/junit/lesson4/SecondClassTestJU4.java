package com.itvdn.junit.lesson4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondClassTestJU4 {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before SecondClassTestJU4.class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After SecondClassTestJU4.class");
    }
    @Test
    public void test(){
        System.out.println("JUnit");
    }
}
