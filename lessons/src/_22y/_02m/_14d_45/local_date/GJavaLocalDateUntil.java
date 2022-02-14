package _22y._02m._14d_45.local_date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GJavaLocalDateUntil {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(2021, 5, 22);
        LocalDate d2 = LocalDate.parse("2021-12-25");

        System.out.printf("%s days%n", d1.until(d2, ChronoUnit.DAYS));
        System.out.printf("%s months%n", d1.until(d2, ChronoUnit.MONTHS));
        System.out.printf("%s years%n", d1.until(d2, ChronoUnit.YEARS));
    }
}
