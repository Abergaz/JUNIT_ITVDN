package com.itvdn.junit.lesson4;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SecondClassTestJU5 {
    @BeforeAll
     static void beforeClass() {
        System.out.println("Before SecondClassTestJU5.class");
    }
    @AfterAll
     static void afterClass(){
        System.out.println("After SecondClassTestJU5.class");
    }
    @Test
     void test(){
        System.out.println("JUnit");
    }
}
