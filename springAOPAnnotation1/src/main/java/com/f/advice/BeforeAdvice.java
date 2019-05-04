package com.f.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect  // 2.标记为一个切面
@Component  // 1.标记当前这个类为spring的一个组件, 相当于xml中注册一个bean一样
public class BeforeAdvice {
    // 3.编写建议 对个before component @Order()进行排序，但仅适用于类级别，从小到大
    // * com.f.*.*(..))  不包含f包
    // * com.f..*.*(..))  包含f包
    @Before("execution(* com.f.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("曾经沧海难为水 (before)");
        // 获取方法名参数
        System.out.println("signature: " + joinPoint.getSignature().getName());
    }
}
