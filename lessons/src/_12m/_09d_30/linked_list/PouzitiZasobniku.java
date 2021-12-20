package _12m._09d_30.linked_list;

import java.sql.SQLOutput;

public class PouzitiZasobniku {
    public static void main(String[] args) {
        Zasobnik<String> zs = new Zasobnik<>();
        zs.add("prvni");
        zs.add("druhy");
        zs.add("treti");
        System.out.println(zs.get());//treti
        while(zs.isEmpty() == false){
            System.out.println(zs.remove());
        } //treti, druhy, prvni
        System.out.println();
        Zasobnik<Integer> zi = new Zasobnik<>();
        zi.add(Integer.valueOf(8));
        zi.add(Integer.valueOf(9));
        while(zi.isEmpty() == false) {
            System.out.println(zi.remove()+" ");
        }//9,8

    }
}
