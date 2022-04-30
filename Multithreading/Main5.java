public class Main5 extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " created successfullly!! and its priority is-> ");
        // priority of both main and thread is same until you dont change the priority of thread1 mannualy
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main method priority:");
        System.out.println(Thread.currentThread().getPriority());
        Main5 thread1 = new Main5();
        thread1.setName("thread1");
        thread1.setPriority(10);//manually changing to 10 but default both will have 5
        thread1.start();
    }
}
