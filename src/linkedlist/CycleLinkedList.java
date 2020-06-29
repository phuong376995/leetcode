package linkedlist;

/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
 *
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/29/20
 */

public class CycleLinkedList {

    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     *  Given a linked list, determine if has a cycle in it.
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null) {
            int count = 0;
            while (fast != null) {
                if (slow == fast) {
                    return true;
                }
                fast = fast.next;
                count++;
                if (count == 2) {
                    break;
                }
            }
            slow = slow.next;
        }
        return false;
    }
}
