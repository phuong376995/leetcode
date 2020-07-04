package linkedlist;


/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/29/20
 */

public class CycleLinkedList {

    public static void main(String[] args) {

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

    /**
     * The problem: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode curNode = head;
        while (curNode != null) {
            int result = checkNode(curNode);
            if (result == -1) {
                return null;
            } else if (result == 1) {
                return curNode;
            } else {
                curNode = curNode.next;
            }
        }
        return null;
    }

    private int checkNode(ListNode curNode) {
        if (curNode == null) {
            return -1;
        }

        ListNode slow = curNode;
        ListNode fast = curNode;

        while (slow!= null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                if (slow == curNode) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }
}
