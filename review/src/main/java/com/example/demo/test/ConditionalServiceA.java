package com.example.demo.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

//@Service("conditionalServiceA")
@Service
@ConditionalOnProperty(name = "test.flag", havingValue = "true")
public class ConditionalServiceA implements ConditionalService{
    @Override
    public void print() {
        System.out.println("aaa");
    }
}
