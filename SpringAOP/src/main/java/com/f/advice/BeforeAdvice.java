package com.f.advice;


import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

// 方法的前置通知
public class BeforeAdvice {
    public void methodBefore() {
        System.out.println("在方法之前执行");
    }

    // joinPoint可以获取几乎所有方法的信息
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));

        System.out.println("method name is : " + name);
    }
}



