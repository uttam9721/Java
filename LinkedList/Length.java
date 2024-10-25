package LinkedList;

public class Length {
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;

    }
    public static class Node{
        int data;  // this is the value;
        Node next; //khud ka data or next ka address store ho;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5); // this is the new node
        Node b = new Node(6); // this is the new node
        Node c = new Node(7); // this is the new node
        Node d = new Node(8); // this is the new node
        Node e = new Node(9); // this is the new node
        Node f = new Node(9); // this is the new node
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
System.out.println(length(a));
    }
    
}
