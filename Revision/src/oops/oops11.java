package oops;
// static methods -> not needed object to call them
// static methods are members of class not objects
// static methods can access the static variable and also change there value
// this and super cannot used inside the static block
class Student5{
    int id;
    String name;
    static String school = "St. Pauls";
//    constructor
    Student5(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
//    static method to school name
    static void schoolChanger(String college)
    {
        school = college;
    }
    void display()
    {
        System.out.println(id+"   "+name+"    "+school);
    }
}
public class oops11 {
    public static void main(String[] args) {
         Student5 s1 = new Student5(101,"Bhoti");
//          bhoti is in school so not calling the changeSchool method
         s1.display();
         Student5 s2 = new Student5(201,"Jatin");
         Student5.schoolChanger("Dit");
         s2.display();
        Student5 s21= new Student5(202,"Vaibhav Joshi");
        s21.display();
//          divyam in geu college
        Student5 s3 = new Student5(301,"Divyam");
        Student5.schoolChanger("GEU");
        s3.display();
        Student5 s31 = new Student5(302,"Shivam Khati");
        s31.display();
    }
}
