// Performing single task from multiple threads(this means that we have single run method but multiple threads)
import java.lang.Thread;
public class C3 extends Thread{
    public void run() {
      System.out.println("Created thread task complete");
    }
    public static void main(String[] args) {
        // You can make multiple threads by making multiple objects of a class and then calling the start method with each of them
        C3 thread1 = new C3();
        thread1.start();
        C3 thread2 = new C3();
        thread2.start();
    }
}
