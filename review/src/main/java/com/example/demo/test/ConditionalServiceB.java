package com.example.demo.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

//@Service("conditionalServiceB")
@Service
@ConditionalOnProperty(name = "test.flag", havingValue = "false")
public class ConditionalServiceB implements ConditionalService{
    @Override
    public void print() {
        System.out.println("bbb");
    }
}
