package oops;
// Constructors in java
// rules
// 1)- same name as the class
// 2)- no return type
// 3)- can not be abstract,  static, final, synchronized
public class oops7 {
    int id;
    String name;
//     default constructor
    oops7()
    {
        System.out.println("Hi am default constructor");
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args) {
        oops7 obj1 = new oops7();
    }
}
