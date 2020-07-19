package linkedlist;


/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1227/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/19/20
 */

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        ListNode x1 = new ListNode(1);
        ListNode x2 = new ListNode(6);
        ListNode x3 = new ListNode(4);
        x1.next = x2;
        x2.next = x3;

        ListNode y1 = new ListNode(1);
        ListNode y2 = new ListNode(3);
        ListNode y3 = new ListNode(4);
        y1.next = y2;
        y2.next = y3;

        mergeTwoLists(x1, y1);
        LinkedListUtil.printLinkedList(y1);
    }

    /**
     * Merge two sorted linked list and return it as a new linked list
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currentNode1 = l1;
        while (currentNode1 != null) {
            boolean existNode = false;
            ListNode currentNode2 = l2;
            ListNode tempNode = new ListNode(currentNode1.val);
            while (currentNode2 != null) {
                if (currentNode1.val >= currentNode2.val && (currentNode2.next == null || currentNode1.val <= currentNode2.next.val)) {
                    existNode = true;
                    tempNode.next = currentNode2.next;
                    currentNode2.next = tempNode;
                    break;
                }
                currentNode2 = currentNode2.next;
            }
            if (!existNode) {
                tempNode.next = l2;
                l2 = tempNode;
            }
            currentNode1 = currentNode1.next;
        }
        return l2;
    }
}
