package com.itvdn.junit.lesson4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeoutTestJU5 {
    @Test
    void timeout() throws InterruptedException {
        Assertions.assertTimeout(Duration.ofMillis(500), () -> Thread.currentThread().sleep(1000));
    }
}
