package com.itvdn.junit.lesson4;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class FileCreatorTestJU4 {
    @Test(expected = IOException.class)
    public void testByAnnotationTest() throws IOException{
        FileCreator.createTempFile();
    }
    @Test
    public void testByTryCatch(){
        try {
            FileCreator.createTempFile();
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotEquals("",e.getMessage());
        }
    }
    @Test
    public void testByAssertJ(){
      Throwable throwable = Assertions.catchThrowable(() -> FileCreator.createTempFile());
      Assertions.assertThat(throwable).isInstanceOf(IOException.class);
      Assertions.assertThat(throwable.getMessage()).isNotBlank();
    }
}