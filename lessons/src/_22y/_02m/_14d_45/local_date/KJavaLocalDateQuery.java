package _22y._02m._14d_45.local_date;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.List;

public class KJavaLocalDateQuery {
    public static void main(String[] args) {

        var dates = List.of(LocalDate.of(2020, 9, 1), LocalDate.of(2020, 1, 15),
                LocalDate.of(2020, 1, 1), LocalDate.of(2020, 11, 14),
                LocalDate.of(2020, 12, 24), LocalDate.of(2020, 3, 6),
                LocalDate.of(2020, 8, 8), LocalDate.of(2020, 12, 16),
                LocalDate.of(2020, 5, 8), LocalDate.of(2020, 10, 21));

        dates.forEach(d -> {
            checkBirthday(d);
        });

    }

    private static void checkBirthday(LocalDate d) {

        Boolean isBirthday = d.query(new Birthdays());

        if (isBirthday.booleanValue()) {

            System.out.printf("%s is a family birthday%n", d);
        } else {

            System.out.printf("%s is not a family birthday%n", d);
        }

    }
}
class Birthdays implements TemporalQuery<Boolean> {

    @Override
    public Boolean queryFrom(TemporalAccessor ta) {

        int month = ta.get(ChronoField.MONTH_OF_YEAR);
        int day = ta.get(ChronoField.DAY_OF_MONTH);

        if ((month == Month.JANUARY.getValue()) && day == 15) {
            return Boolean.TRUE;
        }

        if ((month == Month.MARCH.getValue()) && day == 6) {
            return Boolean.TRUE;
        }

        if ((month == Month.MAY.getValue()) && day == 19) {
            return Boolean.TRUE;
        }

        if ((month == Month.AUGUST.getValue()) && day == 8) {
            return Boolean.TRUE;
        }

        if ((month == Month.OCTOBER.getValue()) && day == 21) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}