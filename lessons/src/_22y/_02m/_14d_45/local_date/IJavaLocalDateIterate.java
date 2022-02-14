package _22y._02m._14d_45.local_date;

import java.time.LocalDate;

public class IJavaLocalDateIterate {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2021, 4, 5);
        LocalDate end = LocalDate.of(2021, 5, 22);

        start.datesUntil(end).forEach(System.out::println);
    }
}
