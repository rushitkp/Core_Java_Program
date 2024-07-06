class Construct1 {
    int a;
    float f;
    String s;
    boolean b;

    Construct1() {
        a = 100;
        f = 343;
        s = "Rk Prajapati";
        b = true;
    }

    // Construct1(int a, float f, String s, boolean b) {
    //     a = 108;
    //     f = 1;
    //     s = "Rk";
    //     b = true;
    // }

    void display() {
        System.out.println("int a=" + a);
        System.out.println("float f=" + f);
        System.out.println("String s=" + s);
        System.out.println("boolean b=" + b);
    }

    // void show() {
    //     System.out.println("int a=" + a);
    //     System.out.println("float f=" + f);
    //     System.out.println("String s=" + s);
    //     System.out.println("boolean b=" + b);
    // }
}

class Construct {
    public static void main(String[] args) {
        Construct1 c = new Construct1();
        c.display();
        // c.show();
    }
}
