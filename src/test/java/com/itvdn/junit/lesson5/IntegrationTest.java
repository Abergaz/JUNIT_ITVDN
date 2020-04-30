package com.itvdn.junit.lesson5;


import org.junit.Test;
import org.junit.experimental.categories.Category;

//Помечаем тестовый класс в категорию, в качетве имени используем интрфейс
@Category(SlowTest.class)
public class IntegrationTest {
    @Test
    public void accountIntegration() {
        System.out.println("Slow test accountIntegration");
    }
    @Test
    public void dbIntegration(){
        System.out.println("Slow test dbIntegration");
    }

}
