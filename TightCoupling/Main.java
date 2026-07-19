package BackendFoundation.TightCoupling;

class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.placeOrder();
    }

}
