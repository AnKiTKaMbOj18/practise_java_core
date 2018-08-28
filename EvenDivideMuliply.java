package practise_java_core;

import java.util.Scanner;

//java program if number is even divide by 2 else multiply by 3 and add 1
//  until value of n becomes 1
public class EvenDivideMuliply {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of n");
    int n=sc.nextInt();
    int counter=0;
    while(n!=1){
      System.out.println("value of n "+n);
      if(n%2==0){
        n=n/2;
        counter++;
      }
      else{
        n=(n*3+1)/2;
        counter++;
      }
    }
    System.out.println("counter incremented "+counter+" times");
    sc.close();
  }
}
