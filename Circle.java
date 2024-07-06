class pr1 {
    float PI = 3.14f;
    int r;

    void getR(int x) {
        r = x;
    }

    void area() {
        System.out.println("Area of circle = " + (float) PI * r * r);
    }
}

class Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getR(10);
        c1.area();
    }
}