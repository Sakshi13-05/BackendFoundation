package BackendFoundation.LooseCoupling1;

import javax.management.Notification;

import BackendFoundation.LooseCoupling1.Notification.EmailNotification;
import BackendFoundation.LooseCoupling1.Notification.NotificationService;
import BackendFoundation.LooseCoupling1.Notification.SMSNotifiaction;

public class OrderService {
    NotificationService notify = new SMSNotifiaction();

    public void placeOrder() {
        System.out.println("Your order is been placed");
        notify.sendNotification();
    }
}
