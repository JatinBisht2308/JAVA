public class Main7 extends Thread {
    // override the run method
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Inside " + Thread.currentThread().getName() + "!");
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // creating the user thread
        Main7 thread1 = new Main7();
        thread1.setName("My first Thread");
        thread1.start();
    }
}
