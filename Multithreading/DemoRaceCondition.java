
class Increment {
    public int count = 0;

    // critical section;
    int increment() {
        count++;// shared resource
        return count;
    }
}

public class DemoRaceCondition {

    public static void main(String[] args) throws InterruptedException {
        Increment i1 = new Increment();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 200000; i++) {
                i1.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 20000; i++) {
                i1.increment();
            }
        });

        t1.start();
        t2.start();

        // enabling that main thread should complete after these 2 ckasses finish their
        // execution:
        t1.join();
        t2.join();

        System.out.println(i1.count);
    }
}
