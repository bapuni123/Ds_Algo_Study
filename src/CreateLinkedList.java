public class CreateLinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] ages){
        CreateLinkedList llist = new CreateLinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;
    }
}
