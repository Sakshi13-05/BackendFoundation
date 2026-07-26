package com.beanlifecycle.bean_lifecycle;

import java.util.HashMap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

// task : after injection and useing the function middle step is to perform certain ini
// working ( i want afterProperties to work   before  add to cart ie perform any ini before business logic)
// 1.object creation 
// 2.callback will come to addPro[peerties]
// method1
// @Component
public class CartService /* implements InitializingBean */ {
    HashMap<Integer, String> map;

    public CartService() {
        // ex-i want clear the filled map before any new xanc happen
        map = new HashMap<>();
        System.out.println("cart service constr called");
    }

    public void addToCart() {
        System.out.println("Added to Cart");

    }

    public void start() {
        map.put(1, "shampoo");
        System.out.println(map);

    }

    @PostConstruct
    public void start2() {
        System.out.println("demo of postconstruct");
    }

    // @Override
    // public void afterPropertiesSet() throws Exception {
    // map.put(1, "shampoo");
    // System.out.println(map);
    // }
}
