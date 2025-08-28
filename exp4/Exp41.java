class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    SinglyLinkedList() {
        head = null;
    }

    // Insert at beginning
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Exp41 {
    public static void main(String[] args) {
        System.out.println("Singly Linked List:");
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertAtBeginning(10);
        sll.insertAtEnd(20);
        sll.insertAtBeginning(5);

        sll.display();

        sll.deleteAtBeginning();
        sll.display();

        sll.deleteAtEnd();
        sll.display();
    }
}
