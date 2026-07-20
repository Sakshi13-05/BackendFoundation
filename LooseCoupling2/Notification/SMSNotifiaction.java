package BackendFoundation.LooseCoupling2.Notification;

public class SMSNotifiaction implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notification by SMS");
    }
}
