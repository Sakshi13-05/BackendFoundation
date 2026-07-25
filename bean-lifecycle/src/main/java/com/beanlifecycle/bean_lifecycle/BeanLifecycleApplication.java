package com.beanlifecycle.bean_lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanLifecycleApplication {

	public static void main(String[] args) {
		// creation of ioc container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// reflection brings the metadata
		OrderService order = context.getBean(OrderService.class);
		order.placeOrder();

	}
}
