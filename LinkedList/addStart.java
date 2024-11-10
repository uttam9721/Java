package LinkedList;

public class addStart {
    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t=head;
        while (t.next!=null) {
            t=t.next;  
        }
        t.next=temp;

    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedList {
        Node head = null;
        Node tail = null; 

        void addEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        // find index 
        int getAt(int idx){
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
                
            }
            return temp.data;
        }
        void deleteAt(int idx){
            Node temp = head;
            for(int i =1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
            // size--
        }

        void display() {
            Node temp = head;
            while (temp != null) { // Corrected this line
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int length(){
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
                
            }return count;
        }
        void addStart(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }

        // add value in the given index
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp=head;
            if (idx==length()) {
                addEnd(val);
                return;
                
            }else if(idx==0){
                addStart(val);
            }
    
            for(int i =1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addEnd(4);
        ll.addEnd(5);
        ll.addEnd(6);
        ll.addEnd(7);
        ll.addEnd(78);
        ll.addStart(0);


        Node a = new Node(5);
        Node b= new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);

        a.next=b;
        b.next=c;
        c.next=d;
        // ll.display();
        // ll.addStart(0);
        // ll.insertAt(3,100);
        insertAtEnd(a,88);
        // ll.display(a);
        ll.deleteAt(6);
        ll.display();
        // System.out.println(ll.tail.data);
        // System.out.println(ll.length());
        // System.out.println(ll.getAt(3));
    }
    
}
