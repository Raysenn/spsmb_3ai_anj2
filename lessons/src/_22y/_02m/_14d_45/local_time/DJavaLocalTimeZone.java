package _22y._02m._14d_45.local_time;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DJavaLocalTimeZone {
    public static void main(String[] args) {

        ZoneId zone1 = ZoneId.of("Europe/Bratislava");
        ZoneId zone2 = ZoneId.of("Europe/Moscow");

        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);

        System.out.printf("Bratislava time: %s%n", now1);
        System.out.printf("Moscow time: %s%n", now2);

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);
    }
}
