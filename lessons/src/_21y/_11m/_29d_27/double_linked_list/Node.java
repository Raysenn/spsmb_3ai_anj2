package _21y._11m._29d_27.double_linked_list;

public class Node implements Comparable<Node>{
    Integer data;
    Node prev;
    Node next;

    public Node(Integer data, Node prev) {
        this.data = data;
        this.prev = prev;
    }

    public Node(Integer data) {
        this.data = data;
        this.prev = null;
    }


    @Override
    public int compareTo(Node o) {
        return this.data - o.data;
    }
}
