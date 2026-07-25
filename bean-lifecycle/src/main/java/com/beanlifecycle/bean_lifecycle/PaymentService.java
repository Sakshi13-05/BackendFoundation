package com.beanlifecycle.bean_lifecycle;

import org.springframework.stereotype.Component;

// bean2
@Component
public class PaymentService {
    public void pay() {
        System.out.println("payment done");
    }
}
