class box {
    double l;
    double w;
    double h;

    // for rectangle
    box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // for cubes
    box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public void display() {
        System.out.println("Hi im the parent of first my name is box!!!");
    }
}
