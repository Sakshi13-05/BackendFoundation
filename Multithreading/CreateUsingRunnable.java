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
    }
}

class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Task created by Runnable");
    }
}
