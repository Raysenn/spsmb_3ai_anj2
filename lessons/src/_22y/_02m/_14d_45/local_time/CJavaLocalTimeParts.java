package _22y._02m._14d_45.local_time;

import java.time.LocalTime;

public class CJavaLocalTimeParts {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.printf("Hour: %s%n", time.getHour());
        System.out.printf("Minute: %s%n", time.getMinute());
        System.out.printf("Second: %s%n", time.getSecond());
    }
}
