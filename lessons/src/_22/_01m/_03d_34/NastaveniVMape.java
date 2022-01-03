package _22._01m._03d_34;

import java.util.HashMap;
import java.util.Map;

//Praktické použití mapy
public class


NastaveniVMape {
    private static String[] key = {"pozadi", "popredi", "ramecek"};
    private static String[] hodDef = {"bila", "cerna", "modra"};
    private static String[] hodUziv = {null, "modra", "cervena"};

    static Map<String, String> operations(String[] hodnoty ) {
        Map<String, String> m = new HashMap<>();

        for (int i = 0; i < key.length; i++) {
            if(hodnoty[i] != null) {
                m.put(key[i], hodnoty[i]);
            }
        }
        return m;
    }

}
