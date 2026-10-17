public class DemoVisiblity {
    volatile static boolean flag = false;// flag=true;IN RAM--solution use volatile

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            flag = true;// read from own cache
        });

        // read falg value from own cache
        Thread t2 = new Thread(() -> {
            while (!flag) {
                // System.out.println("T2 is running");//synchronised operation ---therefore we
                // cant see here visiblity problem
            }
            System.out.println("T2 is finsihed");
        });

        t1.start();
        t2.start();
    }
}
