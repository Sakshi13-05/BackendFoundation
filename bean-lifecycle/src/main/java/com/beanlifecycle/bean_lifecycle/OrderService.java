package com.beanlifecycle.bean_lifecycle;

import org.springframework.stereotype.Component;

// bean1
@Component
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println("order placed");
        paymentService.pay();
    }

}
