package com.xinqi;

import com.xinqi.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        classPathXmlApplicationContext.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)classPathXmlApplicationContext.getBean("demoService");
        // Executing remote methods
        demoService.sayHello();
    }
}
