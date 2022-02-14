package _22y._02m._14d_45.local_date;

import java.time.LocalDate;

public class DJavaLocalDateDayOf {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        System.out.println(now);

        System.out.printf("Day of year: %s%n", now.getDayOfYear());
        System.out.printf("Day of month: %s%n", now.getDayOfMonth());
        System.out.printf("Day of week: %s%n", now.getDayOfWeek());
    }
}
