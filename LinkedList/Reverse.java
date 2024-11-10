package LinkedList;

public class Reverse {
    public static void displayr(Node head){
        if(head==null) return;
        displayr(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            }
    }
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head) {
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
            
        }return count;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next=b;
        b.next=c;
        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        System.out.println(length(a));
    }
    
}
