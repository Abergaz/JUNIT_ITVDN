package com.itvdn.junit.lesson4;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({SecondClassTestJU5.class, OrderExampleTestJU5.class})
public class SuiteClassTestJU5 {
}
