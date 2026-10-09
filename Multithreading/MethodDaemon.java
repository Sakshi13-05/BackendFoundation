package Multithreading;

public class MethodDaemon {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Thread is running");
            }
        });
        t1.setDaemon(true);
        t1.start();

        return;

    }
}
