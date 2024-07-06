import java.util.Scanner;

class While {

  public static void main(String[] args) {
    // int count = 0;
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();

    while (count <= 100) {
      System.out.println(count);
      count++;
    }
  }
}
