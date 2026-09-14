package BackendFoundation.LooseCoupling2;

import BackendFoundation.LooseCoupling2.Notification.EmailNotification;
import BackendFoundation.LooseCoupling2.Notification.SMSNotifiaction;;

class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService(new SMSNotifiaction());
        service.placeOrder();
    }

}
