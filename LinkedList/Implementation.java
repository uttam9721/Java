package LinkedList;

// import LinkedList.Add.linkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void add(int val) {
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                // tail=temp;

            }else {
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
                
            }
        }

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.display();
        
    }
    
}
