package question1;public class Solution {
    public static void printLinkedList(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        }
        SinglyLinkedListNode current = head;
        System.out.println("Total number of nodes : "+SinglyLinkedListNode.numberOfInstances);
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
}
