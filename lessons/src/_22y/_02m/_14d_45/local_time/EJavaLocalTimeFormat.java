package _22y._02m._14d_45.local_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EJavaLocalTimeFormat {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ISO_TIME;
        System.out.println(now.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(now.format(dtf2));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(now.format(dtf3));
    }
}
