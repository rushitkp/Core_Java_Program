abstract class Programing {
    public abstract void developer();

    public abstract void Rank();
}

abstract class Html extends Programing {
    public void developer() {
        System.out.println("Tim Berners Lee");
    }
}

abstract class Java extends Programing {
    public void Rank() {
        System.out.println("James Berling");
    }
}

class Abstract_Method {
    public static void main(String[] args) {
        Html h = new Html();
        h.developer();
        Java j = new Java();
        j.Rank();
    }
}