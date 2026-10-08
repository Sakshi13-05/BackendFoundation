package Multithreading;

public class CreateUsingRunnable {
    public static void main(String[] args) {
        MyRunnableClass r1 = new MyRunnableClass();
        Thread t1 = new Thread(r1);
        t1.start();

        // since Runaable is funtional interface we can use lambda
        Thread t2 = new Thread(() -> System.out.println("This is lambda expression"));
        t2.start();
    }
}

class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Task created by Runnable");
    }
}
