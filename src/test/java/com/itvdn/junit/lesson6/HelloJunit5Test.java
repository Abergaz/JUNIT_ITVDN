package com.itvdn.junit.lesson6;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;


@DisplayName("Override class name")
public class HelloJunit5Test {

    @Test
    @DisplayName("Test print")//Переобределение отображения имени метода
    void firstTest(){
        System.out.println("Hello Junit5!");
    }
    @Test
    void baseAssertions(){
        assertEquals("a","a");
        assertEquals(2,1+1,"Optional message");
        assertEquals(3,1+2, ()->"Lazy evaluation message");//строка вычислиться только при не успехе
    }

    @Test //групповые проверки assertAll
    void groupedAssertions(){
        Person person = new Person("Ivan","Ivanovich");
        assertAll(
                ()->assertEquals("Ivan",person.getFirstName()),
                ()->assertEquals("Ivanovich",person.getLastName())
        );
    }

    @Test
    void assertTrueWithLambda(){
        List<String> list = Arrays.asList("ITVDN","junit");
        assertFalse(list::isEmpty);
        assertTrue(list.contains("junit"));
    }

    @RepeatedTest(value = 5, name = LONG_DISPLAY_NAME)
    void repeatTest(RepetitionInfo info, TestInfo testInfo){
        System.out.println(info.getCurrentRepetition() + " - " +testInfo.getDisplayName());
    }

}
