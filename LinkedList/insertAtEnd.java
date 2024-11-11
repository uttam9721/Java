package LinkedList;

public class insertAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
                Node temp = new Node(val);
               if(head==null){
                head=temp;
                tail=temp;
                
               }else{
                tail.next = temp;
                tail = temp;
               }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
                }
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);  //4
        ll.insertAtEnd(5);  //4 5
        ll.insertAtEnd(6);  //4 5 6 
        ll.insertAtEnd(7);  //4 5 6 7
        ll.display();
    }
}