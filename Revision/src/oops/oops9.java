package oops;
// constructor overloading
public class oops9 {
    int id;
    String name;
    String subject;
    int marks;
    oops9()
    {
        System.out.println("Hi im default");
        display();
    }
    oops9(int id,String name)
    {
        this.id = id;
        this.name = name;
        display();
    }
    oops9(String subject,int marks)
    {
        this.subject = subject;
        this.marks = marks;
        display();
    }
    oops9(int id,String name,String subject,int marks)
    {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        display();
    }
    void display()
    {
        System.out.println(id+"   "+name+"    "+subject+"-> "+marks);
    }
    public static void main(String[] args) {
        oops9 s1 = new oops9();
        oops9 s2  = new oops9(1000015028,"Jatin Bisht");
        oops9 s3 = new oops9("Java",100);
        oops9 s4 = new oops9(1000015098,"Tushar Gahtori","Java",99);

    }
}
