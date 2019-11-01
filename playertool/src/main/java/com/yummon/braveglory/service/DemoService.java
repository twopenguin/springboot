package com.yummon.braveglory.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {
    
    public String demoHello(){
        System.out.println("hello");
        final IDemoService bean = (IDemoService) AopContext.currentProxy();
        bean.normalHello();
        return "hello";
    }
    
    public String normalHello(){
        System.out.println("normal");
        return "normal";
    }
}
