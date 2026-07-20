package BackendFoundation.LooseCoupling1.Notification;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notification by Email");
    }
}