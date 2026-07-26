package com.beanlifecycle.bean_lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 */
@Configuration
@ComponentScan
public class AppConfig {
    @Bean(initMethod = "start")
    public CartService getCartBean() {
        return new CartService();
    }

}