public class Main11 extends Thread{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName());
            for(int i=0; i<4;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Interrupt occurs!!");
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Main11 thread1 = new Main11();
        thread1.start();
        thread1.interrupt();
    }
}
