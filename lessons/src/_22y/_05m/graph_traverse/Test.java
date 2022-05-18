package _22y._05m.graph_traverse;

public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node currN = new Node(1);
        Node currN2 = new Node(2);
        Node currN3 = new Node(3);
        Node currN4 = new Node(4);
        Node currN5 = new Node(5);
        Node currN6 = new Node(6);
        Node currN7 = new Node(7);
        Node currN8 = new Node(8, true);

        graph.getHead().next.add(currN);

        currN.next.add(currN2);
        currN.next.add(currN4);

        currN4.next.add(currN2);
        currN4.next.add(currN5);
        currN4.next.add(currN6);

        currN2.next.add(currN3);

        currN6.next.add(currN3);
        currN6.next.add(currN7);

        currN3.next.add(currN8);

        graph.printGraphDFS(graph.getHead());
    }
}
