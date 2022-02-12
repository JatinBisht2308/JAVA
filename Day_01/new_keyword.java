public class new_keyword {
    String name;
    new_keyword(String name)
    {
        this.name = name;
    }
    public static void main(String[] args) {
        new_keyword obj1 = new new_keyword("First Object Attached");
        new_keyword obj2 = obj1;
        // This means that both the obj1 and obj2 pointing to the same class variable name and showing value as First object Attached
        System.out.println(obj2.name);
        // Here you can see if we change the name via obj2 then obj1 name is also changing because both are pointing to a single class and haviong single refrence
        obj2.name = "Second object Attached";
        System.out.println(obj1.name);
        // Example as bf and gf drinking juice from a same glass with 2 straws
    }
}
