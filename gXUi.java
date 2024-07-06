// import java.util.Scanner;
//Type Converter
// class Type_Casting {
//     public static void main(String args[]) {
//         // int a=23;
//         // float b=a;
//         // System.out.println(b);

//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextInt();
//         System.out.println(a);
//     }
// }

import java.util.Scanner;

class Type_Casting {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // float num = sc.nextFloat();
        // int num2 = (int) num;
        // System.out.println(num2);

        // char ch='A';
        // int ch1=ch;
        // System.out.println(ch1);

        // char a='a';
        // char b='b';
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println(a+b);

        short a = 5;
        byte b = 10;
        char c = 'A';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);

        // int a = 10;
        // float b = 10.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);
    }
}