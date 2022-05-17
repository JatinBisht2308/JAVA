package oops;
//1)- initializing the object means storing data in the object
//first way is to initializing via reference variable

class Student2{
    int id;
    String name;
}
public class oops3 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
//        initializing below
        s1.id = 101;
        s1.name = "Jatin";
        System.out.println(s1.id);
        System.out.println(s1.name);

        s2.id = 102;
        s2.name = "Bisht";
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
