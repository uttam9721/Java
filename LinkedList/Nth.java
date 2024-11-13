package LinkedList;

public class Nth {
    public static Node nthNode(Node head,int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int a = size -n+1;

    }
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b= new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp=nthNode(a);
        
    }
    
}
