package com.itvdn.junit.lesson5;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ModuleTest {

    @Test
    @Category(FastTest.class)//помечаем метод в категорию тестов в качестве имени имя тинтерфейса
    public void testAccount(){
        System.out.println("Fast testAccount");
    }
    @Test
    @Category({FastTest.class,SlowTest.class})
    public void addAccountToDb(){
        System.out.println("Fast and Slow addAccountDb");
    }
}
