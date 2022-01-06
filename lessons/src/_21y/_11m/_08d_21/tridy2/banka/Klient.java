package _21y._11m._08d_21.tridy2.banka;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

//Vytvořte třídu Klient, která bude mít jako jednu členskou
// proměnnou referenci na objekt třídy BankovniUcet. Modifikujte třídu Banka,
// aby pracovala s klienty
// místo účty.
public class Klient {
    String jmeno;
    String prijmeni;
    String adresa;
    GregorianCalendar datumNarozeni;

    public Klient(String jmeno, String prijmeni, String adresa, GregorianCalendar datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.adresa = adresa;
        this.datumNarozeni = datumNarozeni;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "jmeno='" + this.jmeno + '\'' +
                ", prijmeni='" + this.prijmeni + '\'' +
                ", adresa='" + this.adresa + '\'' +
                ", datumNarozeni=" +
                new SimpleDateFormat("dd.MM.YYYY").format(this.datumNarozeni.getTime()) +
                '}';
    }
}
