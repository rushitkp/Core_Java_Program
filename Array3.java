import java.util.Scanner;

class Array3 {
    public static void main(String[] args) {

        // int size,i;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array:");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("Enter Element Array:");
        for (int i = 0; i < size; i++) {
            // System.out.println(a[i] + " ");
            a[i] = sc.nextInt();
        }

    }
}
