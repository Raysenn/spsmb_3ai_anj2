package _22y._02m._14d_45.local_time;

import java.time.LocalTime;

public class FJavaLocalTimeArithmetic {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // LocalTime addition
        System.out.println("Adding 3 hours: " + now.plusHours(3));
        System.out.println("Adding 30 minutes: " + now.plusMinutes(30));
        System.out.println("Adding 45 seconds: " + now.plusSeconds(45));
        System.out.println("Adding 40000 nanoseconds: " + now.plusNanos(40000));

        // LocalTime subtraction
        System.out.println("Subtracting 3 hours: " + now.minusHours(3));
        System.out.println("Subtracting 30 minutes: " + now.minusMinutes(30));
        System.out.println("Subtracting 45 seconds: " + now.minusSeconds(45));
        System.out.println("Subtracting 40000 nanoseconds: " + now.minusNanos(40000));
    }
}
