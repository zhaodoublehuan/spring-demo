package com.tower.springdemo.aop.test;

import com.tower.springdemo.aop.service.BusinessService;
import com.tower.springdemo.ioc.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tower
 */
public class SpringAopTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BusinessService businessService = (BusinessService) applicationContext.getBean("businessService");
        businessService.annotationHello();
    }
}
