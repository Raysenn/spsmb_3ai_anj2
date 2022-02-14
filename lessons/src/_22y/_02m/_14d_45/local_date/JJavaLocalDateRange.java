package _22y._02m._14d_45.local_date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class JJavaLocalDateRange {
    public static void main (String[] args) {

        LocalDate d = LocalDate.of(2021, 5, 22);

        ValueRange r = d.range(ChronoField.DAY_OF_MONTH);

        System.out.printf("DAY_OF_MONTH: %s%n", r);

        r = d.range(ChronoField.DAY_OF_WEEK);
        System.out.printf("DAY_OF_WEEK: %s%n", r);

        r = d.range(ChronoField.YEAR);
        System.out.printf("YEAR: %s%n", r);

        r = d.range(ChronoField.DAY_OF_YEAR);
        System.out.printf("DAY_OF_YEAR: %s%n", r);

        r = d.range(ChronoField.YEAR_OF_ERA);
        System.out.printf("YEAR_OF_ERA: %s%n", r);

        r = d.range(ChronoField.ERA);
        System.out.printf("ERA: %s%n", r);
    }
}
