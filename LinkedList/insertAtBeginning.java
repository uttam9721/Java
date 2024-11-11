package LinkedList;

public class insertAtBeginning {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;

        void insertAtHead(int val){
            Node temp =new Node(val);
           if (head==null) {
                head=tail=temp;
           }else{
            temp.next=head;
            head=temp;

           }
        }
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
    void insertAt(int idx,int val){
        Node t = new Node(val);
        Node temp = head ;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
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
        ll.insertAtHead(1);
        ll.insertAtHead(2);
        ll.insertAtHead(3);
        ll.insertAtEnd(4);  //4
        ll.insertAtEnd(5);  //4 5
        ll.insertAtEnd(6);  //4 5 6 
        ll.insertAtEnd(7);  //4 5 6 7
        ll.insertAtEnd(8);  //4 5 6 7
        ll.insertAt(2,10);
        ll.display();
    }
    
}
