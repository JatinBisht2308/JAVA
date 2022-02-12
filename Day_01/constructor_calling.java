public class constructor_calling {
    int rno;
    String name;
    constructor_calling()
    {
                // in this way you can call the another constructor from a constructor       
        // this(1, "abc");
        System.out.println("Name of Google Ceo is:");
    }
    constructor_calling(int rno,String name)
    {
      this();
      this.name = name;
      this.rno = rno;
    }
    public static void main(String[] args) {
        constructor_calling jatin = new constructor_calling(1,"Jatin");
        System.out.println(jatin.name);
        System.out.println(jatin.rno);
    }
}
