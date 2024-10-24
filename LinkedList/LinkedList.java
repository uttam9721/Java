package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // step1 => create new node;
        Node newNode = new Node(data);
        if (head==null) {
                head=tail=newNode;
                return;
        }

        // step2 => newNode next = head;
        newNode.next=head;  //link
        // step3 => newNode
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
            
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if (head==null) {
            System.out.println("ll is empty");
            return;
            
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
            }
            System.out.println("null");
    }

    // add middle value 
    public void add(int idx,int data){
        if (idx==0) {
            addFirst(data);
            return;
            
        }
        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;
        while(count<idx-1){
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        // this is type of object we can create node here;
        LinkedList ll = new LinkedList();
    ll.print();
      ll.addFirst(0);
      ll.print();
      ll.addFirst(1);
      ll.print();
      ll.addLast(2);
      ll.print();
      ll.addLast(3);
      ll.add(2,9);
      ll.add(3,10);
      ll.print();
    }
    
}
