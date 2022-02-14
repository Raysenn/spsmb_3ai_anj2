package _22y._02m._14d_45.local_time;

import java.time.LocalTime;

public class HJavaLocalTimeCompare {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(4, 23, 12);
        LocalTime time2 = LocalTime.of(8, 03, 50);
        LocalTime time3 = LocalTime.of(12, 47, 35);

        if (time1.compareTo(time2) == 0) {
            System.out.println("time1 and time2 are equal");
        } else {
            System.out.println("time1 and time2 are not equal");
        }

        if (time2.isBefore(time3)) {
            System.out.println("time2 comes before time3");
        } else {
            System.out.println("time2 does not come before time3");
        }

        if (time3.isAfter(time1)) {
            System.out.println("time3 comes after time1");
        } else {
            System.out.println("time3 does not come after time1");
        }
    }
}
