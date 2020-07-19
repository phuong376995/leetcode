package linkedlist;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/19/20
 */

public class LinkedListUtil {

    public static void printLinkedList(ListNode head) {
         ListNode currentNode = head;
         while (currentNode != null) {
             System.out.print(currentNode.val + " ");
             currentNode = currentNode.next;
         }
        System.out.println();
    }
}
