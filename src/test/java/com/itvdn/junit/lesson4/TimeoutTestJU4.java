package com.itvdn.junit.lesson4;

import org.junit.Test;

public class TimeoutTestJU4 {
    @Test(timeout = 500)
    public void timeout() throws InterruptedException{
        while (true){
            Thread.currentThread().sleep(1000);
        }
    }
}
