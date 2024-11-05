package LinkedList;

public class Display {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void displayr(Node head){
        if(head==null) return;
        { 
            displayr(head.next);
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        } 

    }
    public static int length(Node head){
        int count = 0;
        while (head!=null) {
            count++;
            head=head.next;
            
        }
        return count;
    }
    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        // display(a);
        // displayr(a);
        length(a);
        System.out.println(length(a));

    }
    
}
