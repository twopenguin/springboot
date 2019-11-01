package com.yummon.braveglory.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {

    /**
     * 定义切点：如果有此注解的地方
     */
    @Pointcut("execution(public * com.yummon.braveglory.service.IDemoService.*())")
    public void serviceAspect() {
    }
    
    @Before(value = "serviceAspect()")
    public void before(){
        System.out.println("===before===");
    }
    
    @After(value = "serviceAspect()")
    public void after(){
        System.out.println("===after===");
    }
}
