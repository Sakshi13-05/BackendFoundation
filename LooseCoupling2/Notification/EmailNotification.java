package BackendFoundation.LooseCoupling2.Notification;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Notification by Email");
    }
}