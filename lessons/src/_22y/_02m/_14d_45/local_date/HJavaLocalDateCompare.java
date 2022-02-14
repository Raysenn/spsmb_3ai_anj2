package _22y._02m._14d_45.local_date;

import java.time.LocalDate;

public class HJavaLocalDateCompare {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(2020, 2, 12);
        LocalDate d2 = LocalDate.of(2021, 3, 15);
        LocalDate d3 = LocalDate.of(2021, 5, 22);

        if (d1.compareTo(d2) == 0) {
            System.out.println("date1 and date2 are equal");
        } else {
            System.out.println("date1 and date2 are not equal");
        }

        if (d2.isBefore(d3)) {
            System.out.println("date2 comes before date3");
        } else {
            System.out.println("date2 does not come before date3");
        }

        if (d3.isAfter(d1)) {
            System.out.println("date3 comes after date1");
        } else {
            System.out.println("date3 does not come after date1");
        }
    }
}
