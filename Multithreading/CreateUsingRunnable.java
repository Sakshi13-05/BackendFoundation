package Multithreading;

public class CreateUsingRunnable {
    public static void main(String[] args) {
        MyRunnableClass r1 = new MyRunnableClass();
        Thread t1 = new Thread(r1);

        // since Runaable is funtional interface we can use lambda
        Thread t2 = new Thread(() -> System.out.println("This is lambda expression"));
        t2.start();
        t1.start();

        // name of thread
        System.out.println(Thread.currentThread().getName());

        // Checking what if we directly execute run function instead of start
        Thread t3 = new Thread(() -> System.out.println("Demo of executing directly run()"));
        System.out.println(Thread.currentThread().getName());
        // op of line 18 main beacuse start() tell jvm to create a thread
        // therefore until you dont execute that main thread will only run

    }
}

class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Task created by Runnable");
    }
}
