package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // step1 = create new node;
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;

        }

        // step2 newnode nexr = head;
        newNode.next=head; 

        // step 3 ;
    }
  

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       ll.addFirst(1);
       ll.addFirst(2);
        
    }
    
}
