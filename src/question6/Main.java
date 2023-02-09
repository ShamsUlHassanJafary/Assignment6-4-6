package question6;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        head.next = new SinglyLinkedListNode(2);
        head.next.next = new SinglyLinkedListNode(3);
        head.next.next.next = new SinglyLinkedListNode(4);
        head.next.next.next.next = new SinglyLinkedListNode(5);

        head = Solution.reverse(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
