package _12m._06d_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PoleNaKolekci {
    public static void main(String[] args) {
        String[] pole = {"1", "2", "3"};
        //Takto vytvořený seynam nelze zvětšovat ani zmenšovat

        //Vhodné pro seznam pevné velikosti. Např.:
        List<String> karty = Arrays.asList(new String[8]);

        List<String> seznam = Arrays.asList(pole);
        System.out.println(seznam);
        //NELZE (UnsupportedOperationException) !!!
        //seznam.remove(0);
        //NELZE (UnsupportedOperationException) !!!
        //seznam.add("5");
        System.out.println(seznam);
        pole[1] = "osm";
        System.out.println(seznam);
        List<String> ar = new ArrayList<String>(seznam);
        ar.add("5");
        System.out.println(ar);
    }
}
