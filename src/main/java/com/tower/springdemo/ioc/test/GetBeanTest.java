package com.tower.springdemo.ioc.test;

import com.tower.springdemo.aop.service.BusinessService;
import com.tower.springdemo.ioc.config.AppConfig;
import com.tower.springdemo.ioc.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tower
 */
public class GetBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoService demoService = applicationContext.getBean(DemoService.class);
        DemoService demoService1 = (DemoService) applicationContext.getBean("demoService");
        System.out.println(demoService==demoService1);
        demoService.printHello();
        demoService1.printHello();
    }
}
