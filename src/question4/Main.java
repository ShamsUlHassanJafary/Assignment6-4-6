package question4;

public class Main {

    public static void main(String[] args) {
        LinkedList.SinglyLinkedListNode head = null;

        head = LinkedList.insertNodeAtPosition(head, 1, 0);
        head = LinkedList.insertNodeAtPosition(head, 2, 1);
        head = LinkedList.insertNodeAtPosition(head, 3, 2);

        LinkedList.SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
