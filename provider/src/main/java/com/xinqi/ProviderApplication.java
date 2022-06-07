package com.xinqi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * @author 这是一个服务提供者主方法
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        //使用IPV4地址
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        //Spring提供了一个ApplicationListener接口来监听各种ApplicationEvent。一个这样的事件是 ContextStartedEvent。您可以创建某个实现 ApplicationListener<ContextStartedEvent> 的类的 bean。
        //当您调用 start() 时，ApplicationContext 将发布这样一个事件，并且为 ContextStartedEvent 注册的所有ApplicationListener bean（如果在上下文中找到它们会自动注册）将得到通知。
        classPathXmlApplicationContext.start();
        //防止因无Bean使用导致程序给关闭
        System.in.read();
    }
}
