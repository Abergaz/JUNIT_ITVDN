package com.itvdn.junit.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SafeAdditionUtilTest {
    private SafeAdditionUtil util = new SafeAdditionUtil();
    //1 -вариант с примитивами
    @Test
    @Parameters({
            "1,2,3",
            "-10,30,20",
            "15, -5, 10",
            "-5, -10, -15"
    })
    public void whenWithAnnotationProviderParams_thenSafeAdd(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }
    //2 вариант с медотом возвращающим массив параметров
    @Test
    @Parameters(method = "parametersToTestAdd")
    public void whenWithAnnotationProviderParams_thenSafeAdd2(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

    public Object[] parametersToTestAdd() {
        return new Object[]{
                new Object[]{1, 2, 3},
                new Object[]{-10, 30, 20},
                new Object[]{Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
                new Object[]{Integer.MIN_VALUE, -8, Integer.MIN_VALUE}
        };
    }

    // 3 вариант с параметризованным классом
    @Test
    @Parameters(source = ProviderTestData.class)
    public void whenWithAnnotationProviderParams_thenSafeAdd3(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

    // 4 вариант с использованием csv файла
    @Test
    @FileParameters("src/test/resources/Parameters.csv")
    public void whenWithAnnotationProviderParams_thenSafeAdd4(int a, int b, int result) {
        assertEquals(result, util.safeAdd(a, b));
    }

}