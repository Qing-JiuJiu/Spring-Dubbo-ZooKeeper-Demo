package com.xinqi;

import com.xinqi.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 这是一个消费者主方法
 */
public class ConsumerApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        classPathXmlApplicationContext.start();
        //获取远程服务代理
        DemoService demoService = (DemoService)classPathXmlApplicationContext.getBean("demoService");
        //执行远程方法
        demoService.sayHello();
    }
}
