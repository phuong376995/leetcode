package linkedlist;

/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1296/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/4/20
 */

public class RemoveNthNode {

    public static void main(String[] args) {

    }

    /**
     * Remove the n-th node from the end of list.
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;
        ListNode previousNode = null;
        int count = 1;

        while (currNode != null) {
            if (count == n + 1) {
                previousNode = head;
            }

            if (currNode.next == null) {
                if (previousNode == null) {
                    if (count == n) {
                        return head.next;
                    } else {
                        return head;
                    }
                } else {
                    if (previousNode.next != null) {
                        previousNode.next = previousNode.next.next;
                    }
                    return head;
                }
            }

            currNode = currNode.next;
            previousNode = previousNode == null ? null : previousNode.next;
            count++;
        }
        return head;
    }
}
