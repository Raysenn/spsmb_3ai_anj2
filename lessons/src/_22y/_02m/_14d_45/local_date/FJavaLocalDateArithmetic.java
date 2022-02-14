package _22y._02m._14d_45.local_date;

import java.time.LocalDate;

public class FJavaLocalDateArithmetic {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println("Current Time: " + now);

        // LocalDate addition
        System.out.println("Adding 3 days: " + now.plusDays(3));
        System.out.println("Adding 12 months: " + now.plusMonths(12));
        System.out.println("Adding 45 weeks: " + now.plusWeeks(45));
        System.out.println("Adding 4 years: " + now.plusYears(4));

        System.out.println("----------------------");

        // LocalDate subtraction
        System.out.println("Subtracting 3 days: " + now.minusDays(3));
        System.out.println("Subtracting 12 months: " + now.minusMonths(12));
        System.out.println("Subtracting 45 weeks: " + now.minusWeeks(45));
        System.out.println("Subtracting 4 years: " + now.minusYears(4));
    }
}
