package com.itvdn.junit.lesson4;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class RuleClassTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    @Test
    public void givenTempFolderRule_whenNewFile_thenFilesCreated() throws IOException{
        File file = temporaryFolder.newFile("file-test.txt");

        assertTrue("The file should have been created",file.isFile());
        assertEquals("Temp folder and test file should match",temporaryFolder.getRoot());
        file.getParentFile();
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void givenIllegalArgument_whenExceptionThow_messageAndCouseMatch(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectCause(CoreMatchers.isA(NullPointerException.class));
        expectedException.expectMessage("This is message");

        throw new IllegalArgumentException("This is message", new NullPointerException());
    }
    @Rule
    public TestName testName = new TestName();
    @Test
    public void testName(){
        assertEquals("testName",testName.getMethodName());
    }
    @Rule
    public Timeout timeout = new Timeout(3);
    @Test
    public void gibenLongRunningTest_whenTimeout_thanTestFail() throws InterruptedException{
        TimeUnit.SECONDS.sleep(5);
    }
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    @Test
    public void givenMultipleErrors_whenTestRun_thenCollectorReportsErrors(){
        errorCollector.addError(new Throwable("First thing went wrong"));
        errorCollector.addError(new Throwable("Second thing went wrong"));
    }

    private List<String> logs = new ArrayList<>();
    @Rule
    public Verifier verifier = new Verifier() {
        @Override
        protected void verify() throws Throwable {
            assertFalse("Message log is not empty", logs.isEmpty());
        }
    };

    @Test
    public void givenNewMessage_whenVerifier_thenMessageLogNotEmpty(){
        assertFalse("Message log is not empty",logs.isEmpty());
    }

}
