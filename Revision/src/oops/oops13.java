package oops;
//invoke current class method(implicitly)
class A{
    void m(){
        System.out.println(" Hello from m method");
    }
    void n()
    {
        System.out.println("Hello from n method");
        this.m();
    }
}
public class oops13 {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
