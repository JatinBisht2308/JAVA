package oops;
// Different ways to create an object in java
// 1)- by new keyword
// 2)- by newInstance() method
// 3)- by clone() method
// 4)- by deserialization
// 5)- by factory method

public class oops6 {
void printHello(String type)
{
    System.out.println(type);
}

    public static void main(String[] args) {
//  this is an anonymous object calling the printHello method(object without any name is anonymous
        new oops6().printHello("Hi am anonymous object without name");
//  giving name to the anonymous object
        oops6 s1 = new oops6();
        s1.printHello("Hi im anonymous object with name s1");
//   creating multiple objects im same line
       oops6 s2 = new oops6(),s3 = new oops6();
       s2.printHello("Hi am s2 object of multiple objects in single line 1");
       s3.printHello("Hi am s3 object of multiple objects in single line 2");
    }
}
