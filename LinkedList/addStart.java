package LinkedList;

public class addStart {
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
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp=head;
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
        // ll.display();
        ll.addStart(0);
        ll.insertAt(2,100);
        ll.display();
        
        // System.out.println(ll.length());
    }
    
}
