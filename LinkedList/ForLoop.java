 package LinkedList;
 class ForLoop {
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            // this.data = data;
        }
    }
    public static void main(String[] args){
     Node a = new Node(5);
     Node b = new Node(6);
     Node c = new Node(7);
     Node d = new Node(8);
     Node e = new Node(800);
     Node f = new Node(900);
     a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
    //  System.out.println(a.data);
    // Node temp = a;
    // while (temp != null) {
    //     System.out.print(temp.data + "->");
    //     temp = temp.next;
    // }
        display(a);
    
}
}
