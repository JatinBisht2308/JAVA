// import java.util.*;
import java.lang.Thread;

// Firsly inherit the thread class
public class C1 extends Thread {
    // override the run method
    public void run() {
    //  Provide the task of the thread
    System.out.println("Thread create succesfully");
    }

    public static void main(String[] args)  {
      C1 t1 = new C1();
    // For creating the thread we need to call the start() method of the thread class which we have inherited here
    t1.start();

    }
}
