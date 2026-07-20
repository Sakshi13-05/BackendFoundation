package BackendFoundation.LooseCoupling1.Notification;

public class SMSNotifiaction implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notification by SMS");
    }
}
