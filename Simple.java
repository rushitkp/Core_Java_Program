class Simple1 {
    int age = 77;

    void display() {
        System.out.println("Enter your Age is " + age);
        if (age >= 18) {
            System.out.println("You Can Voting");
        } else {
            System.out.println("Sorry,You Can Not Voting");
        }
    }
}

class Simple {
    public static void main(String[] args) {
        Simple1 s1 = new Simple1();
        s1.display();
    }
}