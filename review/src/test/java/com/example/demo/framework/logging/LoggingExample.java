package com.example.demo.framework.logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class LoggingExample {

    @Test
    public void LoggingTest() {
        log.info("日志正常输出...");
    }
}
