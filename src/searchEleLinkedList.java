public class searchEleLinkedList {
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
    public boolean search(Node head,int x){
        Node current = head;
        while(current!=null){
            if(current.data==x)
                return true;
            current = current.next;
        }
        return false;
    }
    public void main(String[] args){
        searchEleLinkedList llist = new searchEleLinkedList();
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);
        if(llist.search(llist.head,21)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
