package _21y._11m._29d_27.double_linked_list;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        //dll.printList(dll.getHead());
        for ( Integer data:dll ) {
            System.out.println(data+" ");
        }
    }
}
