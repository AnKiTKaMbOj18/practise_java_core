package practise_java_core;

import java.util.Scanner;

public class SumOfNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter an integer between 0 and 1000");
    int n = sc.nextInt();

    int first = n % 10;
    int remain = n / 10;
    int second = remain % 10;
    remain = remain / 10;
    int third = remain % 10;

    int sum = third + second + first;

    System.out.println("sum of all digits of " + n + " is " + sum);
  }
}