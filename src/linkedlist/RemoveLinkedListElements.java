package linkedlist;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/10/20
 */

public class RemoveLinkedListElements {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = head;
        ListNode tempNode = head;
        while (tempNode != null) {
            if (tempNode == head && tempNode.val == val) {
                head = head.next;
                tempNode = head;
                previous = tempNode;
                continue;
            }

            if (tempNode.val == val) {
                previous.next = tempNode.next;
            } else {
                previous = tempNode;
            }
            tempNode = tempNode.next;

        }
        return head;
    }
}
