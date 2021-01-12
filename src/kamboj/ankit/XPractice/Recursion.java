package kamboj.ankit.XPractice;

public class Recursion {


  private static int factorial(int value) {
    if (value == 1) {
      return 1;
    }
    return factorial(value - 1) * value;
  }

  public static void main(String[] args) {
    System.out.println("hello");

    //Recursion example by creating  factorial of a number using recursion

    System.out.println(factorial(4));
  }
}