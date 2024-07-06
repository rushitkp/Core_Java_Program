abstract class animal {
    public abstract void sound();
}

class Dog extends animal {
    public void sound() {
        System.out.println("Dog Is Barking");
    }
}

class Lion extends animal {
    public void sound() {
        System.out.println("Lion Is Roar");
    }
}

class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();

    }
}
