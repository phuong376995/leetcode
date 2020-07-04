package linkedlist;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/4/20
 */

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
