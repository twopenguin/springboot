package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class B {
    
    @Autowired
    private A a;
}
