package com.xinqi;

import com.xinqi.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 这是一个消费者主方法
 */
public class ConsumerApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        //Spring提供了一个ApplicationListener接口来监听各种ApplicationEvent。一个这样的事件是 ContextStartedEvent。您可以创建某个实现 ApplicationListener<ContextStartedEvent> 的类的 bean。
        //当您调用 start() 时，ApplicationContext 将发布这样一个事件，并且为 ContextStartedEvent 注册的所有ApplicationListener bean（如果在上下文中找到它们会自动注册）将得到通知。
        classPathXmlApplicationContext.start();
        //获取远程服务代理
        DemoService demoService = (DemoService)classPathXmlApplicationContext.getBean("demoService");
        //执行远程方法
        demoService.sayHello();
    }
}
