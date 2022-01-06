package _21y._11m._22d_25.dedeni_rozhrani_konstanty;
import _21y._11m._22d_25.rozhrani.Usecka;
public class Obdelnik extends Usecka implements InfoOba{
    private int sirka;

    public Obdelnik(int delka, int sirka) {
        super(delka);
        this.sirka = sirka;
    }

    @Override
    public void kdoJsem() {
        System.out.print(POCET + " Obdelnik");
        //System.out.println(this.getClass().getName());
    }
    @Override
    public void vlastnosti() {
        System.out.println(" = " + this.delka + ", " + this.sirka);
    }
}
