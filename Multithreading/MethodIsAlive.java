package Multithreading;

public class MethodIsAlive {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running");
        });
        System.out.println(t1.isAlive()); // false
        t1.start();
        System.out.println(t1.isAlive());

    }

}
