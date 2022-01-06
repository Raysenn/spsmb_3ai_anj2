package _21y._11m._18d_24.cviceniKolo;

import _21y._11m._18d_24.cviceniVozidlo.JednostopeVozidlo;

// Vytvořte třídu Kolo s proměnnými vyrobce, cena a boolean maPrehazovacku.
// Doplňte do této třídy příslušné metody a konstruktory. Děděním vytvořte
// třídu HorskéKolo, kterému doplňte členské proměnné int prevodyVzadu,
// prevodyVpredu. Zajistěte, aby konstruktor správně vytvářel objekty této
// třídy (např. proměnná maPrehazovacku musí být vždy true).


public class Kolo extends JednostopeVozidlo {

    public Kolo(String vyrobce, int cena, String druh) {
        super(vyrobce, cena, false, druh);
    }

    @Override
    public void vypisCoJsiZac() {

        System.out.println(super.toString());

    }


}
