package kamboj.ankit.XPractice.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class E1LocalDate {

  public static void main(String[] args) {

    LocalDate localDate = LocalDate.now();
    LocalDate yesterday = localDate.minusDays(1);
    System.out.println("today date: " + localDate);
    System.out.println("yesterday date: " + yesterday);
    System.out.println("tomorrow date: " + yesterday.plusDays(2));

    LocalDate ldate = LocalDate.of(2017, 1, 13);
    System.out.println("is Leap year: " + ldate.isLeapYear());
    LocalDate ldate2 = LocalDate.of(2016, 1, 12);
    System.out.println("is Leap year: " + ldate2.isLeapYear());

    LocalDate ldate3 = LocalDate.of(2017, 1, 12);
    LocalDateTime localDateTime = ldate3.atTime(1, 50, 9);
    System.out.println(localDateTime);
  }
}
