package _21y._10m._25d_18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //k vytvoření instance zde není použit operátor new, namísto toho je použita statická metoda .getInstance()
        Calendar praveTed = Calendar.getInstance();
        System.out.format("praveTed: %s%n",praveTed);

        Calendar cal = Calendar.getInstance();
        //.setLenient - (schovívavý, mírný) stanoví, jak se bude instance chovat, pokud  zadáme nesprávný údaj
        //Do instance pak lze např. uložit datum 32.1. Při použití .get() se v případě
        // lenient = true údaj znormalizuje na 1.2. V případě lenient = false dostaneme výjimku
        cal.setLenient(true);
        cal.set(2021, Calendar.OCTOBER, 32);
        System.out.format("%d.%d.%d%n",cal.get(Calendar.DAY_OF_MONTH),
                //opravdu u měsíce přidávat jedničku v případě metody get()
                cal.get(Calendar.MONTH)+1,
                cal.get(Calendar.YEAR));
        cal.setLenient(false);
        cal.set(2021, Calendar.OCTOBER, 31);
        System.out.format("%d.%d.%d%n",cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.MONTH)+1,
                cal.get(Calendar.YEAR));

        //Správné formátování výpisu pomocí SimpleDateFormat
        SimpleDateFormat sdfD = new SimpleDateFormat("MMMM");
        String dlouhyMesic = sdfD.format(cal.getTime());
        System.out.println("MMMM:" + dlouhyMesic); //říjen
        System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));//X
        System.out.println(new SimpleDateFormat("MM").format(cal.getTime()));//10
        //klasický zápis
        System.out.println(new SimpleDateFormat("dd.MM.YYYY").format(cal.getTime()));

    }
}
