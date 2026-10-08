package Multithreading;

public class DemoNonDeterminism {
    public static void main(String[] args) {
        // print even nos
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("T1: " + i);
                }
            }
        });

        // print odd nos
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println("T2: " + i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
