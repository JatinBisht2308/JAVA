// Performing multiple task from single thread(This is an edge case and cant be acheived because thread is itself a sub process.)
import java.lang.Thread;
public class C4 extends Thread{
    public void run() {
        System.out.println("First Task");
    }
    public void run() {
        System.out.println("Second Task");
    }
    public static void main(String[] args) {
        C4 thread1 = new C4();

    }
}
