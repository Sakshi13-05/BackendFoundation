package BackendFoundation.LooseCoupling2;

import BackendFoundation.LooseCoupling2.Notification.EmailNotification;

class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService(new EmailNotification());
        service.placeOrder();
    }

}
