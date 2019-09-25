package com.tower.ioc.service;

import org.springframework.stereotype.Service;

/**
 * @author Tower
 */
@Service
public class DemoService {

    public void printHello() {
        System.out.println("Hello Spring!");
    }
}
