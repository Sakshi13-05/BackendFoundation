package BackendFoundation.DependencyInjection.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import BackendFoundation.DependencyInjection.dependencyInjection.service.OrderService;
import BackendFoundation.DependencyInjection.dependencyInjection.service.RazorPayService;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		RazorPayService razor = new RazorPayService();
		OrderService service = new OrderService(razor);
		service.payForOrder();
	}

}
