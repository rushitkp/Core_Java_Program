class shape {
    void draw() {
        System.out.println("You Are Drawing");
    }
}

class square extends shape {
    void draw() {
        System.out.println("You Can not Drawing");
    }
}

class Override {
    public static void main(String[] args) {
        shape r = new square();
        r.draw();
    }
}
