package com.beanlifecycle.bean_lifecycle;

import java.util.HashMap;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// task : after injection and useing the function middle step is to perform certain ini
// working ( i want afterProperties to work   before  add to cart ie perform any ini before business logic)
// 1.object creation 
// 2.callback will come to addPro[peerties]
// method1
@Component
public class CartService implements BeanNameAware, ApplicationContextAware/*
                                                                           * , DisposableBean/*
                                                                           * implements InitializingBean
                                                                           */ {
    HashMap<Integer, String> map;

    public CartService() {
        // ex-i want clear the filled map before any new xanc happen
        map = new HashMap<>();
        System.out.println("cart service constr called");
    }

    @Override
    public void setBeanName(String name) {
        // TODO Auto-generated method stub
        System.out.println("sakshi is grt");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("sakshi is dev");
    }

    @PostConstruct
    public void start2() {
        System.out.println("demo of postconstruct");
    }

    public void addToCart() {
        System.out.println("Added to Cart");
    }

    // @Override
    // public void destroy() throws Exception {
    // // TODO Auto-generated method stub
    // System.out.println("bean getting destroy");
    // }

    // public void stop() {
    // System.out.println("bean destroyed using destroy method");
    // }
    @PreDestroy
    public void stop() {
        System.out.println("bean destroyed using predestroy");
    }
    // this is for

    // init method

    // public void start() {
    // map.put(1, "shampoo");
    // System.out.println(map);
    // }

    // // }

    // this is for initizalingBean
    // @Override
    // public void afterPropertiesSet() throws Exception {
    // map.put(1, "shampoo");
    // System.out.println(map);
    // }
}
