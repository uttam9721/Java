package LinkedList;

public class insertion {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
    
}
