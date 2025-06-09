
package LinkedList;

public class Practice{
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

   void addFirst(int data){
    Node newNode = new Node(data);
    if (head==null) {
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;

    }
    static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" =>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    void add(int idx,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            return;
            
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void remove(){
        head=head.next;
    }
    void last(){
        // Node newNode = new Node()
        tail.next = null;

    }

    public static void main(String[] args) {
        Practice ll = new Practice();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(1, 10);
        // ll.remove();
        display();
    }
}