package BackendFoundation.DependencyInjection.dependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void payForOrder() {
        paymentService.pay();
    }
}
