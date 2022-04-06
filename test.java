import java.lang.Thread;

class Print {
    synchronized public void print(String s) {
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class test {
    public static void main(String[] args) {
        Print p1 = new Print();
        ThreadA th1 = new ThreadA(p1,"Welcome to my Linkedin");
        th1.start();
        ThreadA th2 = new ThreadA(p1,"WELCOME to my Github");
        th2.start();
    }
}

class ThreadA extends Thread {
    Print p;
    String s;

    ThreadA(Print p,String s) {
        this.p = p;
        this.s = s;
    }

    public void run() {
        // calling print function
        p.print(s);
    }

}
