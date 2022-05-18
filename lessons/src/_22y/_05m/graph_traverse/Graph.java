package _22y._05m.graph_traverse;


import java.util.Iterator;

public class Graph {
    //hlavička, začátek seznamu
    private Node head;

    public Graph() {
        this.head = new Node(0);
    }

    public Node getHead() {
        return head;
    }

    void printGraphDFS(Node n)
    {
        for (Node currentN:n.next) {
            System.out.print(currentN.data + " ");
            if (n.next.isEmpty()){
                System.out.println();
                break;
            }else{
                printGraphDFS(currentN);
            }
        }
    }
}
