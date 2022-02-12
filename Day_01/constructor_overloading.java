public class constructor_overloading {
    int rno;
    String name;
    constructor_overloading(constructor_overloading new_obj){
        this.rno = new_obj.rno;
        this.name = new_obj.name;
    }
    constructor_overloading(int rno,String name){
      this.rno = rno;
      this.name = name;
    }
    public static void main(String[] args) {
        constructor_overloading jatin = new constructor_overloading(1,"Jatin");
        System.out.println(jatin.rno);
        System.out.println(jatin.name);
        
        // passing object in a constructor
        constructor_overloading random = new constructor_overloading(jatin);
         System.out.println(random.rno);
         System.out.println(random.name);
    }
}
