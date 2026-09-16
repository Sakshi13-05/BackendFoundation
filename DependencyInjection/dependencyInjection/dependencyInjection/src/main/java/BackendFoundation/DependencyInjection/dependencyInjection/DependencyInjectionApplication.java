package BackendFoundation.DependencyInjection.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

import BackendFoundation.DependencyInjection.dependencyInjection.service.OrderService;
import BackendFoundation.DependencyInjection.dependencyInjection.service.RazorPayService;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		// By self--ignore spring ioc
		// RazorPayService razor = new RazorPayService();
		// OrderService service = new OrderService(razor);
		// service.payForOrder();

		OrderService service = context.getBean(OrderService.class);
		service.payForOrder();
	}

}
