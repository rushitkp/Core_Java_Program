class Construct {
    int a, b;

    Construct(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Construct1 {
    public static void main(String[] args) {
        Construct c = new Construct(10, 20); // Pass values for 'x' and 'y' when creating an instance
        c.display();
    }
}
