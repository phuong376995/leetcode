package linkedlist;

/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/29/20
 */

public class IntersectionOfTwoLinkedList {

    private class ListNode {

        private int val;

        private ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    private boolean isCommonNode(ListNode nodeA, ListNode nodeB) {
        while (nodeB != null) {
            if (nodeB == nodeA) {
                return true;
            }
            nodeB = nodeB.next;
        }
        return false;
    }

    /**
     * Find the node at which the intersection of two linked lists begins
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            if (isCommonNode(headA, headB)) {
                return headA;
            }

            headA = headA.next;
        }
        return null;
    }
    /**
     * Find the node at which the intersection of two linked lists begins
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB) {
        ListNode listNodeA = headA;
        ListNode listNodeB = headB;
        while (headA != headB) {
            if (headA == null) {
                headA = listNodeB;
            } else {
                headA = headA.next;
            }

            if (headB == null) {
                headB = listNodeA;
            } else {
                headB = headB.next;
            }
        }

        return headA;
    }
}
