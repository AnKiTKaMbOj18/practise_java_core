package practise_java_core;

import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num,counter,sitem,array[];
    System.out.println("enter value of number");
    num=sc.nextInt();
    array=new int[num];

    System.out.println("enter "+num+" array elements");
    for(counter=0;counter<num;counter++)
      array[counter]=sc.nextInt();

    System.out.println("enter search element");
    sitem=sc.nextInt();

    for(counter=0;counter<num;counter++){
      if(array[counter]==sitem){
        System.out.println(sitem+" is present at location "+(counter+1));
        break;
      }
    }
    if(counter==num){
      System.out.println(sitem+" doesn't exist in the list");
    }
  }
}
