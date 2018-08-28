package practise_java_core;

import java.util.Scanner;

public class Switch1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("enter week's day number");
    int day = sc.nextInt();

    System.out.println(getDayName(day));

  }

  public static String getDayName(int day) {
    String dayName = "";
    switch (day){
      case 1:
        dayName="Monday";
        break;
      case 2:
        dayName="Tuesday";
        break;
      case 3:
        dayName="Wednesday";
        break;
      case 4:
        dayName="Thursday";
        break;
      case 5:
        dayName="Friday";
        break;
      case 6:
        dayName="Saturday";
        break;
      case 7:
        dayName="Sunday Funday";
        break;
      default:
        dayName="invalid day number please enter within 1 to 7";
    }
    return dayName;
  }
}
