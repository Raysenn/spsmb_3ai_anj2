package _12m._20d_33;

import java.util.HashMap;

class Vaha {
    double vaha;

    public Vaha(double vaha) {
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "" +vaha ;
    }
    @Override
    public int hashCode() {
        return (int) this.vaha;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj instanceof Vaha == false) {
            return false;
        }
        return (this.vaha == ((Vaha) obj).vaha);
    }
}
public class HashMapZakladniPouziti {
    public static void main(String[] args) {
        HashMap<String, Vaha> hm = new HashMap<>();
        System.out.println("Mapa je prazdna: " + hm.isEmpty() + "a obsahuje prvku: " + hm.size());
        // Vložení hodnot do mapy:
        hm.put("Pavel", new Vaha(85));
        hm.put("Venca", new Vaha(105));
        hm.put("Karel", new Vaha(85));
        System.out.println("Mapa je prazdna: " + hm.isEmpty() + "a obsahuje prvku: " + hm.size());
        System.out.println("mapa: " + hm);
        // odstranění prvku:
        hm.remove("Karel");
        System.out.println("mapa: " + hm);
        hm.put("Karel", new Vaha(70));
        System.out.println("mapa: " + hm);
        //vrácení hodnoty podle klíče




    }
}
