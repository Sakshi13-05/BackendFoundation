package BackendFoundation.DependencyInjection.dependencyInjection.service;

public class GPayService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Payment done by GPay");
    }
}
