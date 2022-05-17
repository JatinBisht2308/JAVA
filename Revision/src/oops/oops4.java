package oops;
// 2) way of initializing object through method's

class Student3
{
    int id;
    String name;
    void setFeilds(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
}
public class oops4 {
    public static void main(String[] args) {
      Student3 s1 = new Student3();
      s1.setFeilds(301,"Tushar Gahtori");
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
