package _12m._06d_29;

import java.util.ArrayList;
import java.util.List;

class CeleCislo{
    private int cislo;

    public int getCislo() {
        return cislo;
    }

    public CeleCislo(int cislo) {
        this.cislo = cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    @Override
    public String toString() {
        return "CeleCislo{" +
                "cislo=" + cislo +
                '}';
    }
}
public class VlastniTridaJakoPrvekSeznamu {
    public static void tiskni(String jmeno, List<CeleCislo> al) {
        int vel = al.size();
        System.out.println(jmeno + " (" + vel + ") : ");
        for (int i = 0; i < vel; i++) {
            System.out.println("[" + i + "]="+al.get(i) + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Vytvoreni seznamu");
        ArrayList<CeleCislo> ar = new ArrayList<CeleCislo>();
        for (int i = 0; i < 5; i++) {
            ar.add(new CeleCislo(i+10));
        }
        tiskni("ar", ar);
        System.out.println("Tisk celeho seznamu: " + ar);

        System.out.println("Pridavani prvku");
        ar.add(2, new CeleCislo(77));
        tiskni("ar", ar);

        //podseznam je pouze pohled do seznamu, nikoliv nový
        //seznam. Změna prvků v podseznamu se tak promítá do
        //hlavního seznamu.
        System.out.println("Vytvoreni podseznamu");
        List<CeleCislo> s1 = ar.subList(2,5);
        tiskni("s1", s1);

        ar.get(3).setCislo(33);
        tiskni("ar", ar);
        tiskni("s1", s1);
    }
}

