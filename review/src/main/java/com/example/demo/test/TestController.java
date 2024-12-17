package com.example.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condition")
public class TestController {

    private final ConditionalService conditionalService;

    public TestController(ConditionalService conditionalService) {
        this.conditionalService = conditionalService;
    }

    @RequestMapping("/test")
    public String test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        applicationContext.getBean("test");
        conditionalService.print();
        return "success";
    }
}
