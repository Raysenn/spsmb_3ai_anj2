package _22y._02m._14d_45.local_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class GJavaLocalTimeUntil {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.parse("22:15:30");

        System.out.printf("%s hours%n", now.until(time, ChronoUnit.HOURS));
        System.out.printf("%s minutes%n", now.until(time, ChronoUnit.MINUTES));
        System.out.printf("%s seconds%n", now.until(time, ChronoUnit.SECONDS));
    }
}
