package kamboj.ankit.XPractice.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class E3LocalDateTime {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();

    System.out.println("before formatting: "+ localDateTime);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");
    String formatDateTime = localDateTime.format(formatter);

    System.out.println(formatDateTime);

    LocalDateTime dateTime = LocalDateTime.of(2019,2,13,8,30);

    System.out.println(dateTime.get(ChronoField.DAY_OF_WEEK));

    MonthDay month = MonthDay.now();
    LocalDate date = month.atYear(1994);
    System.out.println(date);
  }

}
