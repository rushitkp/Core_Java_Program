class A3 {
    static final double PI = 3.14;
    int r;

    void get(int a) {
        r = a;
    }
}

class B extends A3 {
    double area;

    void procces() {
        area = r * r * PI;
    }
}

class Multiinh extends A1 {
    void display() {
        System.out.println("Radius is: " + r);
        System.out.println("Area Of Circle Is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Multiinh m1 = new Multiinh();
        m1.get(75);
        m1.procces();
        m1.display();
        m1.get(7);
        m1.procces();
        m1.display();
        m1.get(3);
        m1.procces();
        m1.display();
    }
}
