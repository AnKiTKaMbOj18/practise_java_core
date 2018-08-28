package practise_java_core;

import java.util.Scanner;

public class SmallestThree {

  public static double min(double x, double y, double z) {
    return Math.min(Math.min(x, y), z);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of x");
    double x = sc.nextDouble();
    System.out.println("enter value of y");
    double y = sc.nextDouble();
    System.out.println("enter value of z");
    double z = sc.nextDouble();

    System.out.println("The smallest of  three is: " + min(x, y, z) + " \n");
  }
}
