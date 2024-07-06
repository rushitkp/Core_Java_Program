package p1;

class A {
    public void show() {
        System.out.println("Package");
    }
}

class B extends A {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}