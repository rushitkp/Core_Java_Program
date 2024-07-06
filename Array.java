import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array:");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Print Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");

        }

        // int arr[] = new int[4];
        int arr[] = { 2, 3, 5, 6, 7 };
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        String s1[] = { "Rk", "Jg", "Rd", "R" };
        for (int j = 0; j <= 4; j++) {
            System.out.println(s1[j]);
        }

    }
}
