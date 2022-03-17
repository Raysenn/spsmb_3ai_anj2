package _22y._02m._14d_45.local_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BJavaLocalDateCreate {
    public static void main(String[] args) {

        // Current date
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        // Specific date
        LocalDate date2 = LocalDate.of(2021, 5, 20);
        System.out.println(date2);

        // Specific date
        LocalDate date3 = LocalDate.parse("2021-05-21", DateTimeFormatter.ISO_DATE);
        System.out.println(date3);

        // Retrieving from LocalDateTime
        LocalDate date4 = LocalDateTime.now().toLocalDate();
        System.out.println(date4);
    }
}
