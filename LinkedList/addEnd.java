package LinkedList;

public class addEnd {
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
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addEnd(4);
        ll.addEnd(5);
        ll.addEnd(6);
        ll.addEnd(7);
        ll.addEnd(78);
        ll.display();
        System.out.println(ll.length());
    }
}
