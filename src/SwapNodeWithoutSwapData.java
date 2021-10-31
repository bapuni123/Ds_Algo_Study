public class SwapNodeWithoutSwapData {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void swapNodes(int x, int y){

        if(x==y)
            return;

        Node prevX = null, currX = head;
        while(currX!=null && currX.data!=x){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY!=null && currY.data!=y){
            prevY = currY;
            currY = currY.next;
        }

        if(currX== null || currY==null)
            return;

        if(prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if(prevY !=null)
            prevY.next = currX;
        else
            head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node tNode = head;
        while(tNode !=null){
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args){
        SwapNodeWithoutSwapData llist = new SwapNodeWithoutSwapData();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("\n Linked list before calling swapNodes() ");
        llist.printList();

        llist.swapNodes(4,3);
        System.out.print("\n Linked list after calling swapNodes() ");
        llist.printList();
    }
}
