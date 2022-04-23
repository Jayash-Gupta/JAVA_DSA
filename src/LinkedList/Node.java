package LinkedList;

public class Node {
    String data;
    Node next;
    Node prev;

    Node(String data) {
        this.data = data;
        this.next = this.prev = null;
    }
}
