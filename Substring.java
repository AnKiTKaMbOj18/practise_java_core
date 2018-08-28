package practise_java_core;

import java.util.Scanner;

public class Substring {

  public static double average(double x, double y, double z) {
    double avg = (x + y + z) / 3;
    return avg;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of x");
    double x = sc.nextDouble();
    System.out.println("enter value of y");
    double y = sc.nextDouble();
    System.out.println("enter value of z");
    double z = sc.nextDouble();

    System.out.println("average of three numbers is: " + average(x, y, z) + " \n");
  }
}
