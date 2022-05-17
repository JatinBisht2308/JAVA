package oops;
// parameterized constructor code
public class oops8 {
    int id;
    String name;
    oops8(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args) {
        oops8 obj1 = new oops8(10001,"Bablu Picaso");
        obj1.display();
    }
}
