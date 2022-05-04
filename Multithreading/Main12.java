public class Main12 extends Thread{
    public void run() {
        // System.out.println(Thread.interrupted()); // this will changes the interrupt status from true to false and then whole for loop will be executed
        System.out.println(Thread.currentThread().isInterrupted());// this will not change the status this will only show the sttatus it is not an static mehtod so we have used currentThrea() as an object reference
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(350);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Main12 th1 = new Main12();
        th1.start();
        th1.interrupt();
    }
}
