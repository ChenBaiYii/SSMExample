package com.f.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAdvice {

    @AfterThrowing(value = "execution(* com.f.HelloBaby.throwMethod())", throwing = "throwMsg")
    public void throwing(JoinPoint joinPoint, java.lang.Throwable throwMsg) {

        System.out.println("异常之后: " + joinPoint.getSignature().getName());
        System.out.println("异常信息: " + throwMsg);
    }

}
