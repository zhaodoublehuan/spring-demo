package com.tower.ioc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Tower
 *
 */
@Configuration
@ComponentScan(basePackages = "com.tower.springdemo")
@EnableAspectJAutoProxy
public class AppConfig {
}
