package LinkedList;

public class Add {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        void add(int val){
            Node temp=new Node(val);
           if (head==null) {
            head=temp;
            tail=temp;
            
           }
           else{
            tail.next=temp;
        }
        tail=temp;
        }
        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.println(temp.data+" ");
                temp=temp.next;
                
            }
        }

    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.add(1);
        // ll.add(2);
        // ll.add(3);
        // System.out.println(ll);
        ll.display();
        
    }
    
}

