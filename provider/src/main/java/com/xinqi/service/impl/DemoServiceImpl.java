package com.xinqi.service.impl;

import com.xinqi.service.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public void sayHello() {
        System.out.println("远程调用成功");
    }
}
