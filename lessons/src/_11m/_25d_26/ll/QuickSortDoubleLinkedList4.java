package _11m._25d_26.ll;

// Java program for Quick Sort on Singly Linled List
// https://www.geeksforgeeks.org/quicksort-on-singly-linked-list/
// https://stackoverflow.com/questions/33072986/iterator-for-a-linkedlist

import java.util.Iterator;
import java.util.Random;

/*sort a linked list using quick sort*/
public
class QuickSortDoubleLinkedList4 implements Iterable {
    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public Object next() {
                if(this.hasNext()){
                    int data = this.current.data;
                    this.current = this.current.next;
                    return data;
                }
                return null;
            }/*
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove not implemented.");
            }*/
        };
    }

    static class Node implements Comparable {
        int data;
        Node prev;
        Node next;

        public Node(int d, Node prev) {
            this.data = d;
            this.next = null;
            this.prev = prev;
        }

        public Node(int d) {
            this(d, null);
        }

        @Override
        public int compareTo(Object o) {
            return this.data - ((Node)o).data;
        }
    }

    Node head;

    void addNode(int data)
    {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node curr = head;
        while (curr.next != null)
            curr = curr.next;

        Node newNode = new Node(data, curr);
        curr.next = newNode;
    }

    void printList(Node n)
    {
        int i = 0;
        while (n != null) {
            System.out.print(((i%10==0)?"\n":" ") + n.data);
            n = n.next;
            i++;
        }
    }
    void swap(Node a, Node b){
        Node tmp, tmpPrev, tmpNext;
        tmpPrev = a.prev;
        tmpNext = a.next;


        if(a.prev != null) {
            a.prev.next=b;
        }
        if(a.next != null){
            a.next.prev=b;
        }
        if (b.prev != null) {
            b.prev.next=a;
        }
        if(b.next != null) {
            b.next.prev=a;
        }
        a.prev = b.prev;
        a.next = b.next;
        b.prev = tmpPrev;
        b.next = tmpNext;
        if(a.prev==null){
            this.head=a;
        }
        if(b.prev==null){
            this.head=b;
        }
    }

    // takes first and last node,
    // but do not break any links in
    // the whole linked list
    Node paritionLast(Node start, Node end) {
        //if (start == end || start == null || end == null)
        //    return start;

        //Node pivot_prev = start;
        Node ni = start;
        Node nj = end;
        Node tmpi, tmpj;
        //int pivot = end.data;

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        loop01:
        while (true) {
            if((nj=nj.prev) == null) break;
            while(ni.compareTo(nj) < 0) {
                ni=ni.next;
            }
            while(nj.compareTo(ni) > 0){
                nj=nj.prev;
                if(nj == ni) break loop01;
            }
            if(ni != null || nj != null) break;
            tmpi=ni.next;
            tmpj=nj.prev;
            this.swap(ni,nj);
            ni=tmpi.prev;
            nj=tmpj.next;
        }

        // swap the position of curr i.e.
        // next suitable index and pivot
        this.swap(ni, end);
        //int temp = curr.data;
        //curr.data = pivot;
        //end.data = temp;

        // return one previous to current
        // because current is now pointing to pivot
        return ni;
    }

    void sort(Node start, Node end) {
        if(start == null || start == end || end == null )
            return;

        // split list and partition recurse
        Node pivot_prev = paritionLast(start, end);
        sort(start, pivot_prev);

        // if pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        //if (pivot_prev != null )
        sort(pivot_prev.next, end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have pivot_prev, so we move two nodes
        //else if (pivot_prev != null
        //        && pivot_prev.next != null)
        //    sort(pivot_prev.next.next, end);
    }

    // Driver Code
    public
    static void main(String[] args)
    {
        QuickSortDoubleLinkedList4 list
                = new QuickSortDoubleLinkedList4();
        list.addNode(30);
        list.addNode(3);
        list.addNode(4);
        list.addNode(20);
        list.addNode(5);
        //Random r = new Random();
        //for (int i=0; i<5; i++){
        //    list.addNode(r.nextInt(1000));
        //}
        int i=0;
        for (Object n: list) {
            i++;
            System.out.print(((i%10==0)?"\n":" ") + n);
        }
        Node n = list.head;
        while (n.next != null)
            n = n.next;

        System.out.println("Linked List before sorting");
        list.printList(list.head);

        list.sort(list.head, n);
        //list.swap(list.head.next,list.head.next.next.next.next);

        System.out.println("\nLinked List after sorting");
        list.printList(list.head);
    }
}

// This code is contributed by trinadumca
