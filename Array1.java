public class Array1 {
    public static void update(int marks[]) {
        for (int i = 0; i <= marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        int marks[] = { 23, 54, 78, 45, 32 };
        update(marks);
        for (int i = 0; i <= marks.length; i++) {
            System.out.println(marks[i]);
        }

        int a[] = new int[3];
        a[0] = 25;
        a[1] = 50;
        a[2] = 100;
        for (int b : a) {
            System.out.println(b);
        }
    }
}