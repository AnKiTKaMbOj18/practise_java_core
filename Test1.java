package practise_java_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Test1 {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.close();

    String []a = s.trim().split("[ !,?._'@]+");
    ArrayList<String> listOfStrings =new ArrayList<String>(Arrays.asList(a));
    System.out.println(listOfStrings.size());

    for(String str:listOfStrings){
      System.out.println(str);
    }
  }
}