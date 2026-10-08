package Multithreading;

public class ThreadLifecycle {
    public static void main(String[] args) {
        // Thread.State->enum show that thread is in which state
        // New stage
        Thread t2 = Thread.currentThread();
        Thread t1 = new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(t2.getState());// --TIME_WAITING
                });
        System.out.println(t1.getState());// --NEW

        t1.start();// --exe lambda exp
        System.out.println(t1.getState());// --RUNNABLE

        try {
            t1.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(t1.getState());// --TERMINATED

    }
}
