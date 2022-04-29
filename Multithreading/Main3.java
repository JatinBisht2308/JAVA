// setting ang getting name of a user defined thread
class MyThread1 extends Thread {
    // override the run method
    public void run() {
        System.out.println("Thread 1 name is->" + Thread.currentThread().getName());
        System.out.println("Thread 1 is completed");
    }
}

class MyThread2 extends Thread {
    // override the run method
    public void run() {
        System.out.println("Thread 2 name is->" + Thread.currentThread().getName());
        System.out.println("Thread 2 is completed");
    }
}

public class Main3 {
    public static void main(String[] args) {
       MyThread1 thread1 = new MyThread1();
       thread1.setName("Jatin 101");
       thread1.start();
       MyThread2 thread2 = new MyThread2();
       thread2.setName("Jatin 102");
       thread2.start();
       System.out.println("Main thread name is ->"+ Thread.currentThread().getName());
       System.out.println("Thread 1 is alive : "+thread1.isAlive());
       System.out.println("Thread 2 is alive : "+thread2.isAlive());
       System.out.println("Main thread is alive : "+Thread.currentThread().isAlive());
    }
}
