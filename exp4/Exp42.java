class DNode {
    int data;
    DNode prev, next;

    DNode(int val) {
        data = val;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    private DNode head;

    DoublyLinkedList() {
        head = null;
    }

    // Insert at beginning
    void insertAtBeginning(int val) {
        DNode newNode = new DNode(val);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int val) {
        DNode newNode = new DNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Display list
    void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Exp42 {
    public static void main(String[] args) {
        System.out.println("\nDoubly Linked List:");
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(10);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(5);

        dll.display();

        dll.deleteAtBeginning();
        dll.display();

        dll.deleteAtEnd();
        dll.display();
    }
}
