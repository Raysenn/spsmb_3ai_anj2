package _22y._02m._14d_45.local_date;

import java.time.LocalDate;

public class CJavaLocalDateParts {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.printf("Year: %s%n", date.getYear());
        System.out.printf("Month: %s%n", date.getMonthValue());
        System.out.printf("Day: %s%n", date.getDayOfMonth());
    }
}
