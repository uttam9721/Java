package LinkedList;

public class apnaCollege {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {


    Node head=null;
    Node tail=null;

    //     public static void reverse(Node head) {
    //         if (head==null) {
    //             return;
    //         }
    //         reverse(head.next);
    //         System.out.print(head.data+" ");
    
        
    // }
    public  void addFirst(int data){
        Node temp = new Node(data);
        if(head == null){
           head = temp;
           tail = temp;
            }
            else{
                temp.next=head;
                head = temp;
            }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
    }
    }
    void addAtEnd(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
    }else{
        tail.next=temp;
        tail=temp;
    }
    }
    int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;

    }
    
}

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.display();
        ll.addFirst(100);
        ll.addFirst(0);
        ll.addFirst(1000);
        ll.addFirst(5);
        ll.addAtEnd(32);
        ll.addAtEnd(34);
        ll.display();
        // System.out.println(ll.length());


        // Node a = new Node(0);
        // Node b = new Node(1);
        // Node c = new Node(2);
        // Node d = new Node(3);
        // Node e = new Node(4);
        // Node f = new Node(5);
        // a.next=b;
        // b.next=c;
        // c.next=d;
        // d.next=e;
        // e.next=f;
        // Node temp=a;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        // System.out.println();
        // reverse(a);

    }
}