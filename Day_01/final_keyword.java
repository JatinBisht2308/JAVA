public class final_keyword {
    int rno;
    String name;
    // final variables should be initalized by the time they are declared.....
    final String university = "DIT";
   public static void main(String[] args) {
    //    by using final keyword in front of a variable or class or then that particular variable and class will be act as a constant throughout the code
      final_keyword obj1 = new final_keyword();
      obj1.name = "jatin";
      obj1.rno =1;
      System.out.println(obj1.name);
      System.out.println(obj1.rno);
      System.out.println(obj1.university);
// making new object but university is same fior every object
      final_keyword obj2 = new final_keyword();
      obj2.name = "tushar";
      obj2.rno =2;
      System.out.println(obj2.name);
      System.out.println(obj2.rno);
      System.out.println(obj2.university);
   }   
}
