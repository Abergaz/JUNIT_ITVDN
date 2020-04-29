package com.itvdn.junit.lesson4;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder - по умолчанию в порядке увеличения хешов имен методов
//@FixMethodOrder(MethodSorters.JVM) - В случайном порядке
@FixMethodOrder(MethodSorters.NAME_ASCENDING) //сортировка по имени
public class OrderExampleTest {
    @BeforeClass
    public static void before(){
        System.out.println("Before OrderExampleTest.class");
    }
    @AfterClass
    public static void after(){
        System.out.println("After OrderExampleTest.class");
    }

    @Test
    public void firstTest() {
        OrderExample.printDetail("firstTest");
    }
    @Test
    public void test(){
        OrderExample.printDetail("test");
    }
    @Test
    public void secondTest(){
        OrderExample.printDetail("secondTest");
    }
}