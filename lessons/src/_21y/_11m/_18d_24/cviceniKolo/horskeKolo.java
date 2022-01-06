package _21y._11m._18d_24.cviceniKolo;

import _21y._11m._18d_24.cviceniVozidlo.JednostopeVozidlo;

public class horskeKolo extends JednostopeVozidlo {
    private int prevodyVpredu;
    private int prevodyVzadu;

    public horskeKolo(String vyrobce, int cena, Boolean maPrehazovacku, String druh, int prevodyVpredu, int prevodyVzadu) {
        super(vyrobce, cena, maPrehazovacku, druh);
        this.prevodyVzadu = prevodyVzadu;
        this.prevodyVpredu = prevodyVpredu;

    }

    @Override
    public void vypisCoJsiZac() {

        System.out.println(super.toString()+" ,prevody vzadu= " + prevodyVzadu + " ,prevody vpredu= " + prevodyVpredu);

    }
}
