package oops;
// this() can be used to invoke current class constructor
class B{
    String laptop;
    B()
    {
        System.out.println(" Hi am default constructor");
    }
    B(String laptop) {
//        calling this() should be in the first line
        this();
        System.out.println("Hi im B class parameterized constructor");
        this.laptop = laptop;
    }
    void display()
    {
        System.out.println(laptop);
    }
}
public class oops14 {
    public static void main(String[] args) {
        B b1 = new B("Apple");
        b1.display();
    }
}
