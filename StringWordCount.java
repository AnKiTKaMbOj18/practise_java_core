package practise_java_core;

import java.util.Scanner;

public class StringWordCount {


  public static int countWords(String str) {
    int count = 0;
    if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ') {
          count++;
        }
      }
      count = count + 1;
    }
    return count; //returns 0 if string starts or ends with 0
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the input string");
    String str = sc.nextLine();
    System.out.println("total numbers of words in input string are: " + countWords(str));

  }
}
