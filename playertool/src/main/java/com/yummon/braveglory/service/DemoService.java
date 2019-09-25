package com.yummon.braveglory.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {
    public String demoHello(){
        System.out.println("hello");
        return "hello";
    }
    
    public String normalHello(){
        System.out.println("normal");
        return "normal";
    }
}
