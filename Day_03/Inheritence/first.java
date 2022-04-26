public class first{
    public static void main(String[] args) {
        int r_l = 5;
        int r_h = 10;
        int r_w = 15;
        box rectangle = new box(r_l,r_w, r_h);
        rectangle.display();
        System.out.println(rectangle.l + " " + rectangle.w + " " + rectangle.h);
        
        System.out.println("Printing the cube sides noww.....");
        double cuebe_side = 10;
        box cube = new box(cuebe_side);
        System.out.println(cube.l + " " + cube.h + " " + cube.w);
        cube.display();
        
    }
}
