package _21y._12m._13d_31.prioritni_fronta;

import java.util.PriorityQueue;
import java.util.Queue;

public class PouzitiPriorityQueue {
    public static void main(String[] args) {
        Queue<Vojak> kantyna = new PriorityQueue<Vojak>();

        kantyna.add(new Vojak(1, "major", "letectvo"));
        kantyna.add(new Vojak(3, "plukovnik", "pechota"));
        kantyna.add(new Vojak(2, "podplukovnik", "policie"));
        kantyna.add(new Vojak(3, "plukovnik", "spojari"));
        kantyna.add(new Vojak(4, "nadplukovnik", "chemici"));
        System.out.println("Fronta najednou: " + kantyna);
        System.out.println("\nPoradi vydeje jidel:");
        while (kantyna.isEmpty() == false){
            System.out.println(kantyna.remove());
        }
    }
}
