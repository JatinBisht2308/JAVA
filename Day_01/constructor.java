public class constructor{
    int rno;
    String name;
    int marks;
    constructor(int rno, String name,int marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    void greeting(){
        System.out.println("Hello "+name+" kaisan baa!!!!");
    }

    void changeName(String Newname)
    {
        this.name = Newname;
    }
    public static void main(String[] args) {
        constructor obj = new constructor(1,"Jatin",99);
        System.out.println(obj.rno);
        System.out.println(obj.name);
        System.out.println(obj.marks);
        obj.greeting();
        obj.changeName("CEO of Google");
        System.out.println(obj.name);

        constructor obj2 = new constructor(2,"Tushar",90);
        System.out.println(obj2.rno);
        System.out.println(obj2.name);
        System.out.println(obj2.marks);
        obj2.greeting();
    }
}