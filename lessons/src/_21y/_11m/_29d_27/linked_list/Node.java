package _21y._11m._29d_27.linked_list;

public class Node implements Comparable {
    int data;
    Node next;



    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
    //vrací záporné číslo, pokud je argument větší,
    //kladné, pokud je menší
    //0, pokud je stejné
    @Override
    public int compareTo(Object o) {
        return this.data - ((Node)o).data;
    }
}
