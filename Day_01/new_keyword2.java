public class new_keyword2 {
    int rno;
    String name;
    new_keyword2(int rno,String name)
    {
        this.rno = rno;
        this.name = name;
    }
    public static void main(String[] args) {
        // we cannot change the value of final primitive datatypes variables but we can change the value of an object reffering to a varibale of a particular class but we can not change the object name and its refrence to a particular class....
        final new_keyword2 obj1 = new new_keyword2(1,"Jatin");
        System.out.println(obj1.rno);
        System.out.println(obj1.name);
        // make it final and we can not assign other object values or refrenmce to the final object as you cn see here
        obj1.name = "tushar";//we can change the value of connected varibales to it but we cannot cange the object to new object as given below i.e you cannot reassign a non primitve datatyp[e like classes and here it is object]
        // obj1 = new new_keyword2(2,"tushar");
        System.out.println(obj1.rno);
        System.out.println(obj1.name);
    }
    
}
