package _22y._05m.graph_traverse;

import java.util.ArrayList;

public class Node implements Comparable {
    int data;
    ArrayList<Node> next;



    Node(int d)
    {
        this.data = d;
        this.next = new ArrayList<>();
    }
    //vrací záporné číslo, pokud je argument větší,
    //kladné, pokud je menší
    //0, pokud je stejné
    @Override
    public int compareTo(Object o) {
        return this.data - ((Node)o).data;
    }
}
