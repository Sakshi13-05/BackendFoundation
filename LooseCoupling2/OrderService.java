package BackendFoundation.LooseCoupling2;

import javax.management.Notification;

import BackendFoundation.LooseCoupling2.Notification.EmailNotification;
import BackendFoundation.LooseCoupling2.Notification.NotificationService;
import BackendFoundation.LooseCoupling2.Notification.SMSNotifiaction;

public class OrderService {
    NotificationService notify;

    public OrderService(NotificationService notify) {
        this.notify = notify;
    }

    public void placeOrder() {
        System.out.println("Your order is been placed");
        notify.sendNotification();
    }
}
