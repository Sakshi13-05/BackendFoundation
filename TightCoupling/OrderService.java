package BackendFoundation.TightCoupling;

import javax.management.Notification;

import BackendFoundation.TightCoupling.Notification.EmailNotification;
import BackendFoundation.TightCoupling.Notification.SMSNotifiaction;

public class OrderService {
    // case1
    EmailNotification notify = new EmailNotification();
    // case2
    SMSNotifiaction snotify = new SMSNotifiaction();

    public void placeOrder() {
        System.out.println("Your order is been placed");
        notify.sendNotification();
    }
}
