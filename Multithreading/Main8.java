public class Main8 extends Thread {
    public void run()
    {
        try{
            for(int i = 1;i<=5;i++)
            {
              Thread.sleep(1000);
              System.out.println(i+": "+Thread.currentThread().getName());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Main8 thread1 = new Main8();
        thread1.setName("Thread-1");
        thread1.start();
        Main8 thread2 = new Main8();
        thread2.setName("Thread-2");
        thread2.start();
    }
}
