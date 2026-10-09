package Multithreading;

public class MethodJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("I am thread t1");
        });

        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("I am thread t2");
        });
        try {
            t1.sleep(1000);
        } catch (Exception e) {

        }

        t2.start();
        /*
         * join without time take threads to waiting state
         */

        // try {
        // // t2.join();// tells that let t2 join then t2 will be executed--o/p
        // // 6->12->28(these are lines)
        // t1.join();// tells that let t1 join then t2 will be executed--o/p 6->28->12
        // } catch (Exception e) {

        // }

        /*
         * join without time take threads to timed_waiting state
         */

        try {
            t2.join(500);// tells that let t2 join then t2 will be executed--o/p
            // 6->12->28(these are lines)
            // t1.join(2000);// tells that let t1 join then t2 will be executed--o/p
            // 6->28->12
        } catch (Exception e) {

        }

        System.out.println("This is end");

    }
}
