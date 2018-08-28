package practise_java_core;

import java.util.Scanner;

public class SumDigit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of a");
    int a = sc.nextInt();

    System.out.println("sum of the digits is: "+SumDigit(a));
  }
  private static int SumDigit(int n){
    int sum=0;
    while(n!=0){
      sum=sum+n%10;
      n=n/10;
    }
    return sum;
  }
}
