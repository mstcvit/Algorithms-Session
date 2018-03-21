/**
 * Created by aadithyavarma on 2/28/2018.
 */



public class LinkedList<I extends Number> {

    // Class to store each element in the Linked List
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    // Inserting an element in the Linked List
    public static Node insert(Node head, int value){
        Node temp = new Node(value);
        if(head == null){
            head = temp;
        }
        else {
            Node cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = temp;
        }
        return head;
    }

    // Displaying the elements of the Linked List
    public static void display(Node head){
        Node cur = head;
        while (cur != null){
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head,1);
        head = insert(head,2);
        head = insert(head,3);
        head = insert(head,4);
        head = insert(head,5);
        head = insert(head,6);
        head = insert(head,7);
        head = insert(head,8);
        display(head);
        System.out.println();
        findMiddle(head);
        System.out.println();
        Node reverse = reverseLinkedList(head);
        display(reverse);
    }

    // Reversing the linked list
    private static Node reverseLinkedList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Finding the middle element
    private static void findMiddle(Node head){
        Node a = head;
        Node b = head;
        if(a.next.next == null && a.next != null){
            a = a.next;
        }
        while (b.next != null && b.next.next  != null){
            a = a.next;
            b = b.next.next;
        }
        System.out.print(a.value);
    }

}
