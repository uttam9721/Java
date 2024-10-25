package LinkedList;

public class pw {
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
        System.out.println(a.next);  //LinkedList.pw$Node@4df828d7
        System.out.println(b.next.data);
        // System.out.println(c);
        
       
        
        
    }
    
}
