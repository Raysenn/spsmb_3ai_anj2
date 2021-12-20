package _12m._06d_29.trida_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReplaceAll {
    public static void main(String[] args) {
        String[] vse = {"1", "2", "3", "1", "2", "3" };
        List<String> list = Arrays.asList(vse);
        System.out.println(list);
        boolean vysledek = Collections.replaceAll(list, "3", "333");
        if(vysledek){
            System.out.format("provedena zmena: %s%n", list);
        } else {
            System.out.println("není co nahrazovat");
        }
    }
}
