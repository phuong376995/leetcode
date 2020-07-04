package linkedlist;

/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/
 *
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/4/20
 */

public class ReverseLinkedList {

    /**
     * Reverse the singly linked list.
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        while (head != null && currNode.next != null) {
            ListNode nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }
}
