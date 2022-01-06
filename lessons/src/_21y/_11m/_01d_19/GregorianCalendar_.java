package _21y._11m._01d_19;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

//Gregoriánský kalendář se používá od 15.10.1582, roky dělitené 100 nejsou npřestupné, roky dělitelné
//400 přestupné jsou.
public class GregorianCalendar_ {
    public static void main(String[] args) throws Exception {
     //aktuální datum a čas
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(new SimpleDateFormat("dd.MM.YYYY hh:mm:ss").format(gc.getTime()));
        //metody
        System.out.println(gc.get(Calendar.MONTH));// pozor měsíce indexované od nuly !
        //přidání hodnoty s kumulativní změnou .add()
        gc.add(GregorianCalendar.HOUR, 3);
        System.out.println(new SimpleDateFormat("dd.MM.YYYY HH:mm:ss a").format(gc.getTime()));
        //přidání hodnoty bez kumulativní změny .roll()
        gc.roll(GregorianCalendar.HOUR, 15);
        System.out.println(new SimpleDateFormat("dd.MM.YYYY HH:mm:ss a").format(gc.getTime()));
        //přidání hodnoty s kumulativní změnou .add()
        //gc.add(GregorianCalendar.DAY_OF_MONTH, 45);
        //System.out.println(new SimpleDateFormat("dd.MM.YYYY HH:mm:ss a").format(gc.getTime()));
        //přidání hodnoty bez kumulativní změny .roll()
        gc.roll(GregorianCalendar.DAY_OF_MONTH, 45);
        System.out.println(new SimpleDateFormat("dd.MM.YYYY HH:mm:ss a").format(gc.getTime()));
        //minimální / maximální hodnoty - mohu nahradit konstantami
        System.out.format("abs min: %d, abs max: %d%n",
                gc.getMinimum(Calendar.DAY_OF_YEAR),
                gc.getMaximum(Calendar.DAY_OF_YEAR)
        );
        //Akruální minimální / maximální hodnoty
        System.out.format(" abs min aktuálního měsíce: %d, abs max aktuálního měsíce: %d%n",
                gc.getActualMinimum(Calendar.DAY_OF_YEAR),
                gc.getActualMaximum(Calendar.DAY_OF_YEAR)
        );
        //FORMÁTOVÁNÍ
        //DD - dny v roce (Calendar.DAY_OF_YEAR)
        //G - ERA "n.l." "před n.l."
        //E - DAY_OF_WEEK
        //a - AM_PM "dop.", "odp."
        //gc.add(GregorianCalendar.YEAR, -2022);
        System.out.println(new SimpleDateFormat("EEEE dd.MMMM.YYYY HH:mm:ss G").format(gc.getTime()));
        System.out.println(new SimpleDateFormat("EE dd.MM.YYYY HH:mm:ss a G").format(gc.getTime()));
        //Další konstruktory třídy GregorianCalendar
        GregorianCalendar gc1 = new GregorianCalendar(new Locale("CZ"));
        GregorianCalendar gc2 = new GregorianCalendar(TimeZone.getTimeZone("Europe/Prague"));
    }

}
