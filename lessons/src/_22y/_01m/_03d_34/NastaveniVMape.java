package _22y._01m._03d_34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Praktické použití mapy
public class


NastaveniVMape {
    private static String[] key = {"pozadi", "popredi", "ramecek"};
    private static String[] hodDef = {"bila", "cerna", "modra"};
    private static String[] hodUziv = {null, "modra", "cervena"};

    static Map<String, String> options(String[] hodnoty ) {
        Map<String, String> m = new HashMap<>();

        for (int i = 0; i < key.length; i++) {
            if(hodnoty[i] != null) {
                m.put(key[i], hodnoty[i]);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Map<String, String> defaultNastaveni = options(hodDef);
        Map<String, String> uzivatelNastaveni = options(hodUziv);
        Map<String, String> platneNastaveni = new HashMap<>(defaultNastaveni);
        platneNastaveni.putAll(uzivatelNastaveni);
        System.out.println("Default:  " + defaultNastaveni);
        System.out.println("Uzivatel: " + uzivatelNastaveni);
        System.out.println("Platne:   " + platneNastaveni);
    }

}
