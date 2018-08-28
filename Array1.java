package practise_java_core;

import java.util.Arrays;

public class Array1 {

  public static void main(String[] args) {

    int arr1[]={50,-20,0};
    int arr2[]={5,-50,10};
    int newArr[]={arr1[0],arr2[2]};

    System.out.println("Array1 "+ Arrays.toString(arr1));
    System.out.println("Array2 "+Arrays.toString(arr2));

    /*System.out.println(newArr[0] +","+newArr[1]);*/
    System.out.println("New Array "+Arrays.toString(newArr));
  }
}
