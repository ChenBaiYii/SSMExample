package com.f.advice;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAdvice {

    @AfterReturning(value = "execution(* com.f.HelloBaby.star())", returning = "returning")
    public void afterReturning(String returning) {
        System.out.println("返回值之后。。。" + returning);

    }

}
