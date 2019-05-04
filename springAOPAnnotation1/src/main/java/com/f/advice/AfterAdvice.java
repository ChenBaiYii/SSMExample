package com.f.advice;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// spring aop只能在运行时织入
@Aspect
@Component
public class AfterAdvice {
    @After("execution(* com.f.HelloBaby.eat(java.lang.String))")
    public void after() {
        System.out.println("除却巫山不是云");
    }
}
