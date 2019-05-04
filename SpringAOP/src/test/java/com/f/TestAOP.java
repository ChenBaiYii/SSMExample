package com.f;

import com.f.service.HelloServices;
import com.f.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        // 不是spring容器管理的bean, 织入无效
//        ProviderService providerService = new ProviderService();
        ProviderService providerService =  ctx.getBean(ProviderService.class);
        providerService.add();
    }


    @Test
    public void m2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        ProviderService providerService =  ctx.getBean(ProviderService.class);
        providerService.add();
        providerService.add("music");
    }

    @Test
    public void m3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        HelloServices helloServices =  ctx.getBean(HelloServices.class);
        System.out.println(helloServices.msg());
    }

    @Test
    public void m4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        HelloServices helloServices =  ctx.getBean(HelloServices.class);
        System.out.println(helloServices.msg());
    }
}
