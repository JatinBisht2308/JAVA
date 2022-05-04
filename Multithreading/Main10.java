public class Main10 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        Main10 th1 = new Main10();
        th1.start();

        // main thread dor loop
        try {
            // now i want to wait for thread-0 to terminate first then execute the main
            // thread program
            th1.join(4000);//inside try catch because it throws exception InterruptedException
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
