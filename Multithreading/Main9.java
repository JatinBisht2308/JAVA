public class Main9 extends Thread{
    public void run()
    {
        // Thread.yield();
        for(int i = 0; i <5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        Main9 Thread1 = new Main9();
        Thread1.start();
        Thread.yield();//this will stops the main method to execute and give preference to the thread1 and when thread1 gets terminated then it will execute the main thread
        for(int i = 0; i <5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    
}
