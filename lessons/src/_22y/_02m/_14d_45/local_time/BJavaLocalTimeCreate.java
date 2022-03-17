package _22y._02m._14d_45.local_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BJavaLocalTimeCreate {
    public static void main(String[] args) {

        // Current Time
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        // Specific Time
        //With LocalTime.of, we can create a specific local time from an hour, minute, second and nanosecond.
        LocalTime time2 = LocalTime.of(7, 20, 45, 342123342);
        System.out.println(time2);

        // Specific Time
        LocalTime time3 = LocalTime.parse("12:32:22",
                DateTimeFormatter.ISO_TIME);
        System.out.println(time3);

        // Retrieving from LocalDateTime
        LocalTime time4 = LocalDateTime.now().toLocalTime();
        System.out.println(time4);
    }
}
