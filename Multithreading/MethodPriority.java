package Multithreading;

public class MethodPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running");
        });
        t1.start();

        System.out.println(t1.getPriority());
        t1.setPriority(10);// just an indication
        System.out.println(t1.getPriority());
    }

}
