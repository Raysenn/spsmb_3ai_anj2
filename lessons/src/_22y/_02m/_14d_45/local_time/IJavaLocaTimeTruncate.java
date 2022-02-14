package _22y._02m._14d_45.local_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class IJavaLocaTimeTruncate {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        System.out.println(now);
        System.out.println(now.truncatedTo(ChronoUnit.HALF_DAYS));
        System.out.println(now.truncatedTo(ChronoUnit.HOURS));
        System.out.println(now.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(now.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(now.truncatedTo(ChronoUnit.MICROS));
    }
}
