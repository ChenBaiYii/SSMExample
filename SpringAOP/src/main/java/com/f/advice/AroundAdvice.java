package com.f.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
    public Object around(ProceedingJoinPoint pjp) {
        try {
            System.out.println("环绕");
            Object proceed =  pjp.proceed();
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
