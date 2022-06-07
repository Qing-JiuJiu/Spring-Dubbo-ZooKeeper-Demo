package com.xinqi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * @author 这是一个服务提供者主方法
 */
public class ProviderApplication {
    public static void main(String[] args){
        //使用IPV4地址
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        classPathXmlApplicationContext.start();
    }
}
