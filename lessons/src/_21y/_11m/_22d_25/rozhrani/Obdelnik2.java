package _21y._11m._22d_25.rozhrani;
//Není problém používat dědění a implementaci jednoho, či
// více rozhraní současně
public class Obdelnik2 extends Usecka implements InfoDalsi {
    private int sirka;

    public Obdelnik2(int delka, int sirka) {
        super(delka);
        this.sirka = sirka;
    }
    @Override
    public void kdoJsem() {
        System.out.print("Obdelnik");
        //System.out.println(this.getClass().getName());
    }
    @Override
    public void vlastnosti() {
        System.out.println(" = " + this.delka + ", " + this.sirka);
    }
    public void vypisSirku(){ //nepatří k žádnému rozhraní
        System.out.println(this.sirka);
    }
}
