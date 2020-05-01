package com.itvdn.junit.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TestFactoryExample {
    @BeforeEach
    void init(){
        System.out.println("Before method");
    }
    @TestFactory
    Collection<DynamicTest> dynamicTests(){
        List<Person> peoples =
                Arrays.asList(
                new Person("Ivan","Ivanovich",33),
                new Person("Jon","Doe",18),
                new Person("Oksana","Ivanivna",33)
        );
        int minAge =18;
       return peoples.stream()
               .map(person -> dynamicTest(person.toString(),
                       ()->assertTrue(person.getAge()>=minAge)))
               .collect(Collectors.toList());
    }

}
