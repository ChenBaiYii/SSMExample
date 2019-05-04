package com.f.advice;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {

    @Around("execution(* com.f.HelloBaby.*(..))")
    public Object around(ProceedingJoinPoint pjp) {
        try {
            System.out.println("around");
            Object proceed = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;

    }

}
