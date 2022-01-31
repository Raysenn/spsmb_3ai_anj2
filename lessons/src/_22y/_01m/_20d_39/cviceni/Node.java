package _22y._01m._20d_39.cviceni;

public class Node {
    Object data;
    Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data) {
        this(data, null);
        //this.data = data;
        //this.next = null;
    }
}
