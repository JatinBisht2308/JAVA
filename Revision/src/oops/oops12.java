package oops;
// this keyword
// uses
// 1)- refer to the current class instance variable
// 2)- invoke current class method(implicitly)
// 3)- this() can be used to invoke current class constructor
// 4)- this can be passed as argument in the method call
// 5)- argument in the constructor call
//6)- return the current class instance from the method
// we will see first use (refer to the current class instance variable)

class Student6{
    int id;
    String name;
    Student6(int id,String name)
    {
//         will not change the value because the compiler gets confuse to whom give the value either local variable or instance variable
        id = id;
        name = name;
    }
    void display()
    {
        System.out.println(id+"    "+name);
    }
}
// see the differenc while using this or not using
class Student7{
    int id;
    String name;
    Student7(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id+"    "+name);
    }
}
public class oops12 {
    public static void main(String[] args) {
        System.out.println("Student 6 class->");
        Student6 s1 = new Student6(111,"Jatin");
        s1.display();
        System.out.println("Student7 class->");
        Student7 s2 = new Student7(101,"jatin bisht");
        s2.display();
    }
}
