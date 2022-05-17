package oops;

// 3)- initializing object via constructors

class Student4{
    int id;
    String name;
    Student4(int id,String name)
    {
        this.id =id;
        this.name = name;
    }
}
public class oops5 {
    public static void main(String[] args) {
        Student4 s1 = new Student4(401,"Piyush Kumar");
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
