package kamboj.ankit.XPractice.DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class E2LocalTime {

  public static void main(String[] args) {
    LocalTime localTime = LocalTime.now();

    System.out.println(localTime);

    LocalTime localTime1 = LocalTime.of(10, 30, 40);
    System.out.println(localTime1);

    LocalTime localTime2 = localTime1.minusHours(2);
    LocalTime localTime3 = localTime1.minusMinutes(20).minusHours(4);

    System.out.println(localTime2);
    System.out.println(localTime3);

    Set<String> zoneId = ZoneId.getAvailableZoneIds();
    LocalDateTime localDateTime = LocalDateTime.now();

    //System.out.println(zoneId);

    List<String> zones = new ArrayList<>(zoneId);
    Collections.sort(zones);

    for (String zone : zones) {
      ZoneId zoneId1 = ZoneId.of(zone);
      ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId1);
      ZoneOffset zoneOffset = zonedDateTime.getOffset();

      int secondsOfHour = zoneOffset.getTotalSeconds() % (60 * 60);
      String out = String.format("%35s %10s%n", zoneId1, zoneOffset);

      // Write only time zones that do not have a whole hour offset
      // to standard out.
      if (secondsOfHour != 0) {
        System.out.printf(out);
      }
    }
  }
}
