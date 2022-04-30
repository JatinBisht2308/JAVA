// Daemon Threads
public class Main4 extends Thread {
    // override the run method
    public void run()
    {
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Thread is created!!!");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Main4 thread1 = new Main4();
        thread1.setDaemon(true);
        thread1.setName("Daemon-1");
        thread1.start();
        // you can see here that if you remove the for loop it will not execute more than 1 line inside the method becuase this is a daemon thread and it will get terminated as soon as the main method gets terminated so for executin more than one ,lines inside the run method i have created a for loop to make main method busy for some time and then daemon thread is able to execute more than 1 lines in the run method but if there is a normal thread then it will print both the line beacuse its life doesent depends upon the main thread it is independent of main thread.
        for(int i = 0;i<10;i++)
        {
            System.out.println("Hi");
        }
        // Thread.currentThread().setDaemon(true); run and see the exception
    }
}
