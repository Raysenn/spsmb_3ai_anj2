package _21y._11m._18d_24.cviceniVozidlo;
//Vytvořte abstraktní třídu JednostopeVozidlo s proměnnou String druh
// a abstraktní metodu void vypisCoJsiZac(), která bude v odvozených třídách
// vypisovat obsah řetězce druh a další informace, např výrobce, cenu
// atd. Od této třídy odvoďte třídu Kolo a třídu Motocykl (např.
// s proměnnou obsahNadrze).

//Ve třídě HorskeKolo překryjte metodu void vypisCoJsiZac() tak, aby
// vypisovala i počty převodů.


public abstract class JednostopeVozidlo {
    public String vyrobce;
    public int cena;
    public Boolean maPrehazovacku;
    public String druh;

    public JednostopeVozidlo(String vyrobce, int cena, Boolean maPrehazovacku, String druh) {
        this.vyrobce = vyrobce;
        this.cena = cena;
        this.maPrehazovacku = maPrehazovacku;
        this.druh = druh;
    }

    @Override
    public String toString() {
        return "JednostopeVozidlo" +
                ", vyrobce='" + vyrobce + '\'' +
                ", cena=" + cena +
                ", maPrehazovacku=" + maPrehazovacku +
                ", druh='" + druh + '\'';
    }

    public abstract void vypisCoJsiZac();
}