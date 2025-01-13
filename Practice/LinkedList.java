package Practice;

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

    public static void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            }
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=tail;
            tail=newNode;
        }
    

    public static void addFirst(int data){
        Node newNode= new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addFirst(0);
        ll.print();
        ll.addLast(1);
        ll.print();
        // System.out.println(addFirst(0));
    }
}