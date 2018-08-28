package practise_java_core;

import java.util.Date;
import java.util.Scanner;

public class RangeDivision {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter start number");
    int x = sc.nextInt();
    System.out.println("enter end number");
    int y = sc.nextInt();
    int z = 3;
    int count=0;
    System.out.println("numbers divisible by " + z + " between " + x + " and " + y + " are: ");
    for (int i = x; i <= y; i++) {
      if (i % z == 0) {
        System.out.print(i+" ,");
        count++;
      }
    }
    System.out.println("\n");
    System.out.println("count of numbers divisible are: "+count);
  }
}
