package linkedlist;

/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/6/20
 */

public class OddEvenLinkedList {

    /**
     *
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        int index = 1;
        ListNode curNode = head;
        ListNode theLastOddNode = null;
        ListNode theLastOvenNode = null;
        while (curNode != null) {
            ListNode theNextNode = curNode.next;
            if (index == 1) {
                theLastOddNode = curNode;
            } else if (index == 2) {
                theLastOvenNode = curNode;
            }
            if (index > 2) {
                if (index %2 != 0) {
                    curNode.next = theLastOddNode.next;
                    theLastOddNode.next = curNode;
                    theLastOvenNode.next = theNextNode;

                } else {
                    theLastOddNode = theLastOddNode.next;
                    theLastOvenNode = theLastOvenNode.next;
                }
            }
            index++;
            curNode = theNextNode;
        }
        return head;
    }
}
