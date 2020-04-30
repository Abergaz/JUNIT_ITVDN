package com.itvdn.junit.lesson5;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//Класс для запуска нескольких тестовых классов
@RunWith(Categories.class)
@Categories.IncludeCategory(FastTest.class)//позводяет запускать только те классы и методы которые помечены указанной категорией
//@Categories.ExcludeCategory изключить классы и методы помечнные указанной категорией
@Suite.SuiteClasses({IntegrationTest.class,ModuleTest.class})
public class CategoryTest {
}
