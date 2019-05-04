package com.f;

import com.f.pojo.Car;
import com.f.pojo.Dog;
import com.f.pojo.Girl;
import com.f.pojo.PrettyGirl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void m1() {
        // 获取上下文对象, spring里声明的对象都要需要上下文对象获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过对象获取girl
        Girl g = (Girl) ctx.getBean("girl");
        // 通过类名获取
        Girl bean = ctx.getBean(Girl.class);


        ((PrettyGirl) g).show();
        System.out.println(g);
        System.out.println(g.getName());
        ((ClassPathXmlApplicationContext) ctx).close();
    }


    @Test
    public void m2() {  // 测试有参构造
        // 获取上下文对象, spring里声明的对象都要需要上下文对象获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = ctx.getBean(Dog.class);

        System.out.println(dog.getName());

        ((ClassPathXmlApplicationContext) ctx).close();
    }



    @Test
    public void m3() {  // test car
        // 获取上下文对象, spring里声明的对象都要需要上下文对象获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = ctx.getBean(Car.class);

        System.out.println(car);

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
