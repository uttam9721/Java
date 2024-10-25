package LinkedList;

public class displayLL {
    public static class Node{
        int data;  // this is the value;
        Node next; //khud ka data or next ka address store ho;

        // this is constructor ;
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

        // 5->6->7->8->9
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
    //    System.out.print(a.data+ " -> ");
    //    System.out.print(b.data+ " -> ");
    //    System.out.print(c.data+ " -> ");
    //    System.out.print(d.data+ " -> ");
    //    System.out.print(e.data+ " -> ");
    //    System.out.println("Null");
    Node temp=a;
    // System.out.println(temp.data);
    // for (int i = 1; i <=5; i++) {
    //     System.out.print(temp.data+ " -> ");
    //     temp=temp.next;
        
    // }
    // System.out.println("null");
     
    while (temp!=null) {
        System.out.print(temp.data+ " -> ");
        temp=temp.next;
        
    }
    System.out.println("Null");
       
        
        
    }
    
}
