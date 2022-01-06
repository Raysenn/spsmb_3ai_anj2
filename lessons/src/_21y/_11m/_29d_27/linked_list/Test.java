package _21y._11m._29d_27.linked_list;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();

        LinkedList ll = new LinkedList();
        ll.append(5);
        ll.append(4);
        ll.append(2);
        for (int i = 0; i < 100; i++) {
            ll.append(r.nextInt(150));
        }
        ll.printList();
        //ll.bubbleSort();

        Node n = ll.getHead();
        while (n.next != null)
            n = n.next;
        ll.sort(ll.getHead(),n);
        ll.printList();
        /*
        Node n = ll.getHead();
        while (n!=null){
            System.out.println(n.data + " ");
            n=n.next;
        }*/
        // Po naimplementování rozhraní Iterable k Třídě LinkedList
        //máme možnost používat foreach cyklus:
        for (Object o:ll) {
            System.out.println(o);
        }

    }

}
