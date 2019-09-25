package com.tower.springdemo.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Tower
 * 日志切面类
 */

@Aspect
@Component
public class LogAspectj {

    /**
     * aop.service下的所有公用方法作为切点
     */
    @Pointcut("execution(public * com.tower.springdemo.aop.service..*(..))")
    public void printLog(){

    };

    /**
     * 所有使用@PrintLog注解的方法作为切点
     */
    @Pointcut("@annotation(com.tower.springdemo.aop.annotation.PrintLog)")
    public void printLogAnnotation(){

    }

    /**
     * 定义在方法执行之前打印日志
     */
    @Before("printLog()")
    public void printLogBefore(){
        System.out.println("在所有的公共方法执行之前打印此信息");
    }

    /**
     * 通过注解来确定是否在方法之前执行
     */
    @Before("printLogAnnotation()")
    public void printLogByAnnotation(){
        System.out.println("在带有【@PrintLog】注解的方法之前执行");
    }
}
