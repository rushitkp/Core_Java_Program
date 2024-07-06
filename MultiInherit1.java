class A {
    int a, b, c;

    void add() {
        a = 120;
        b = 232;
        c = a + b;
        System.out.println("Sum=" + c); 
    }

    void sub() {
        a = 232;
        b = 343;
        c = a - b;
        System.out.println("Sub=" + c);
    }
}

class B extends A {
    void mul() {
        a = 3434;
        b = 233;
        c = a * b;
        System.out.println("Mul=" + c);
    }

    void div() {
        a = 332;
        b = 54;
        c = a / b;
        System.out.println("Div=" + c);
    }
}

class C extends B {
    void rem() {
        a = 2323;
        b = 232;
        c = a % b;
        System.out.println("Rem=" + c);
    }
}

class MultiInherit1 {
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.mul();
        r.div();
        r.rem();
    }
}