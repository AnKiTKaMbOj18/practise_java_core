package practise_java_core;

import java.util.Scanner;

public class StringVowels {


  public static int vowels(String str){
    int count =0;
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
          str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        count ++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the input string");
    String v=sc.next();

    System.out.println("number of vowels in input string are: "+vowels(v));
  }
}
