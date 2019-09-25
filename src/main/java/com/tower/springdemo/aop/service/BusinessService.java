package com.tower.springdemo.aop.service;

import com.tower.springdemo.aop.annotation.PrintLog;
import org.springframework.stereotype.Service;

/**
 * @author Tower
 */
@Service("businessService")
public class BusinessService {

    public void printHello() {
        System.out.println("Hello!");
    }

    public String returnString() {
        System.out.println("这个方法是有返回值的方法！");
        return "hello";
    }

    @PrintLog
    public void annotationHello() {
        System.out.println("这个方法私有，并且可以用来测试备注！");
    }
}
