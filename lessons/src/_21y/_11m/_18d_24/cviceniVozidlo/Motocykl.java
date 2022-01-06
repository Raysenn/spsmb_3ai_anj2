package _21y._11m._18d_24.cviceniVozidlo;

public class Motocykl extends JednostopeVozidlo{
    private int obsahNadrze;

    public Motocykl(String vyrobce, int cena, Boolean maPrehazovacku, String druh, int obsahNadrze) {
        super(vyrobce, cena, maPrehazovacku, druh);
        this.obsahNadrze = obsahNadrze;
    }

    @Override
    public void vypisCoJsiZac() {

        System.out.println(super.toString()+" ,obsah nadrze= " + obsahNadrze);

    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "vyrobce='" + vyrobce + '\'' +
                ", cena=" + cena +
                ", maPrehazovacku=" + maPrehazovacku +
                ", druh='" + druh + '\'' +
                ", obsahNadrze=" + obsahNadrze +
                '}';
    }
}