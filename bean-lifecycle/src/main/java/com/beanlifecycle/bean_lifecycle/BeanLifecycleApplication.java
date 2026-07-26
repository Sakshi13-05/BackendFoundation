package com.beanlifecycle.bean_lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanLifecycleApplication {

	public static void main(String[] args) {
		// creation of ioc container
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// reflection brings the metadata
		// OrderService order = context.getBean(OrderService.class);
		// order.placeOrder();

		// CartService cart = context.getBean(CartService.class);
		// cart.addToCart();

		// FOR SIMULATION OF DESTROY METHOD WE HAVE USED CHILD INTERFACE OF APPLICATION
		// CONTEXT BECAUSE BEFORE DESTRUCTION APP GET CLOSED
		context.close();

	}
}
