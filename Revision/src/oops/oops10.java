package oops;
// static keyword
// used in -> variables, methods, nested classes
// if a variable gets static then it is same for all the objects(static variable gets memory only when the class is loaded)

class Dit{
    int id;
    String name;
    static String college = "DIT";
    Dit(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id+"   "+name+"    "+college);
    }
}
public class oops10 {
    public static void main(String[] args) {
        Dit s1 = new Dit(101,"Jatin");
        s1.display();
        Dit s2 = new Dit(202,"Rashmi");
        s2.display();
    }
}
