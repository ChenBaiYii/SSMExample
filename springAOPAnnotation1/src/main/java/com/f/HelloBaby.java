package com.f;


import org.springframework.stereotype.Component;

@Component
public class HelloBaby {

    public void show() {
        System.out.println("baby");
    }


    public void eat(String message) {
        System.out.println("eating .... " + message);

    }

    public String star() {
        System.out.println("star star star ... ");
        return "is star";
    }


    public void throwMethod() {
        System.out.println("我准备异常");
        throw new RuntimeException("自己抛出的异常");
    }
}
