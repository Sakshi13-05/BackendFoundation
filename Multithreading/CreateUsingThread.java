package Multithreading;

/**
 * CreateUsingThread
 */
public class CreateUsingThread {
    public static void main(String[] args) {
        MyThreadClass t1 = new MyThreadClass();
        t1.start();

        // Printing thread name || ID
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        // getId() deprecated because no sense to know
        // Op-main thread ,3
        // Thread.getName() cannot be used because it is non static
    }

}

class MyThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread created by extending Thread class");
    }
}