package minggu13;

public class Node10 {
    int data;
    Node10 prev, next;

    public Node10 (Node10 prev, int data, Node10 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}