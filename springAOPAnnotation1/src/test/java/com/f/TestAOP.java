package com.f;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBaby helloBaby = ctx.getBean(HelloBaby.class);
        helloBaby.show();

    }


    @Test
    public void m2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBaby helloBaby = ctx.getBean(HelloBaby.class);
        helloBaby.eat("apple ");

    }


    @Test
    public void m3() {  // 测试 returning
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBaby helloBaby = ctx.getBean(HelloBaby.class);
        helloBaby.star();

    }


    @Test
    public void m4() {  // 测试 throwing
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBaby helloBaby = ctx.getBean(HelloBaby.class);
        helloBaby.throwMethod();

    }


    @Test
    public void m5() {  // 测试 around
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBaby helloBaby = ctx.getBean(HelloBaby.class);
        helloBaby.throwMethod();

    }
}
