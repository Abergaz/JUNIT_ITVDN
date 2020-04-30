package com.itvdn.junit.lesson4;

import org.junit.jupiter.api.*;

//MethodOrderer.Random.class - случайный порядок
//MethodOrderer.Alphanumeric.class -сортировка по имени
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Сортировка по аннотации  @Order
public class OrderExampleTestJU5 {
    @BeforeAll
    static void before() {
        System.out.println("Before OrderExampleTestJU5.class");
    }

    @AfterAll
    static void after() {
        System.out.println("After OrderExampleTestJU5.class");
    }

    @Test
    @Order(3)
    void firstTest() {
        OrderExample.printDetail("firstTest");
    }

    @Test
    @Order(1)
    void test() {
        OrderExample.printDetail("test");
    }

    @Test
    @Order(2)
     void secondTest() {
        OrderExample.printDetail("secondTest");
    }
}