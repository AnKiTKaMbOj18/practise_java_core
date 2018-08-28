package practise_java_core;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num, count, sitem, array[], first, last, mid;

    System.out.println("enter number");
    num = sc.nextInt();
    array = new int[num];

    System.out.println("enter " + num + " array elements");
    for(count=0;count<num;count++){
      array[count]=sc.nextInt();
    }
    first=0;
    last=num-1;
    mid=(first+last)/2;
    Arrays.sort(array);//because binary search algorithm works in sorted order
    System.out.println("enter search element");
    sitem=sc.nextInt();

    for(count=0;count<num;count++){
      if(array[mid]<sitem){
        first=mid+1;
      }
      else if(array[mid]>sitem){
        last=mid-1;
      }
      else{
        System.out.println(sitem+" is found in the list");
        break;
      }
      mid=(first+last)/2;
    }
    if(first>last){
      System.out.println(sitem +" doesn't exist in the list");
    }
  }
}
