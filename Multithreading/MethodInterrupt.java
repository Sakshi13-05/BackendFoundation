package Multithreading;

public class MethodInterrupt {
    public static void main(String[] args) {
        // handling interrupt method gracefully as follow:

        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {

                System.out.println("Unstoppable");
            }
        });

        t1.start();
        try {
            t1.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        t1.interrupt();

    }
}
