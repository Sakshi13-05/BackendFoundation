package Multithreading;

public class MethodSleep {
    public static void main(String[] args) {
        System.out.println("Thread starts at line 5");

        Thread t1 = new Thread(() -> {
            System.out.println("I am thread t1");
        });

        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getState() + "current thread is "
                    + Thread.currentThread().getName() + " at line 11");
        } catch (Exception e) {
            System.out.println(e);
        }
        t1.start();

        System.out.println("Thread ends at line 16");

    }
}

/*
 * line 5->11->16
 * I APPLIED SLEEP ON MAIN THREAD
 * STATE TRANSITION ON MAIN running->timed_waiting->running
 * t1 can start at any time not able to guess depends on creation time
 * 
 */
