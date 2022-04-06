import java.lang.Thread;
// implements the runnable interface
public class C2 implements Runnable {
    // override the run method
     public void run()
     {
        System.out.println("Thread created");
     }
     public static void main(String[] args) {
        //  Make object of c2 class
        C2 c2 = new C2();
        // You also have to create the object of the thread class and pass the object of the class which is having the main function i.e C2 class and the object is c2.
        Thread th = new Thread(c2);
        // Now you can call the start method to create the thread.
        th.start();
        System.out.println("Task completed");
     }
}
