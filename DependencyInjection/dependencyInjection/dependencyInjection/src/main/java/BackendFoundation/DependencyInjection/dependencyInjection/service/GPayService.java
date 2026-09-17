package BackendFoundation.DependencyInjection.dependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class GPayService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Payment done by GPay");
    }
}
