public class LinkedListMiddleEle {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printMiddle(){
        Node slow_ptr = head;
        Node fast_ptr = head;
        while(fast_ptr !=null && fast_ptr.next!=null){
           fast_ptr = fast_ptr.next.next;
           slow_ptr = slow_ptr.next;
        }
        assert slow_ptr != null;
        System.out.println("The middle element is [" + slow_ptr.data + "] \n");
    }
    public void printList(){
        Node tnode = head;
        while (tnode !=null){
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        LinkedListMiddleEle llist= new LinkedListMiddleEle();
        for(int i=5;i>0;--i){
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
}
