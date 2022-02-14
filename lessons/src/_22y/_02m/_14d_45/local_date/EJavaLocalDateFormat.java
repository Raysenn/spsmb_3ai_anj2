package _22y._02m._14d_45.local_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class EJavaLocalDateFormat {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(now.format(df));

        DateTimeFormatter df2 = DateTimeFormatter.ISO_ORDINAL_DATE;
        System.out.println(now.format(df2));

        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        System.out.println(now.format(df3));

        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(df4));

        System.out.println("----------------------");

        LocalDate day = LocalDate.of(2020, 9, 20);

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                .withLocale(Locale.FRENCH).format(day));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
                .withLocale(Locale.FRENCH).format(day));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale(Locale.FRENCH).format(day));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                .withLocale(Locale.FRENCH).format(day));
    }
}
