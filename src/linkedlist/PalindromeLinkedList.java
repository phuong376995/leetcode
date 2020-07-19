package linkedlist;

/**
 * The problem: https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1209/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 7/19/20
 */

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
//        ListNode node3 = new ListNode(1);
//        ListNode node4 = new ListNode(2);
//        ListNode node5 = new ListNode(4);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        System.out.println(count(node1));
//        LinkedListUtil.printLinkedList(node1);
//        ListNode head = reverse(node1);
//        printLinkedList(head);
        System.out.println(isPalindrome(node1));
    }

    /**
     * given a linked list, determine if it is a palindrome linked list
     * @param head
     * @return
     */
     public static boolean isPalindrome(ListNode head) {
         int count = count(head);
         if (count == 1) {
             return true;
         }
         int k = count / 2;
         int index = 0;
         ListNode currentNode = head;

         while (currentNode != null) {
             if (index == (count % 2 == 0 ? k : k + 1)) {
                 break;
             }
             index++;
             currentNode = currentNode.next;
         }

         ListNode lastNode = reverse(currentNode);
         index = 0;
         while (index < k) {
             if (head.val != lastNode.val) {
                 return false;
             }
             head = head.next;
             lastNode = lastNode.next;
             index++;
         }

         return true;
    }

    private static int count(ListNode head) {
        ListNode currentNode = head;
        int count = 0;
        while (currentNode != null) {
            count ++;
            currentNode = currentNode.next;
        }
        return count;
    }

    private static ListNode reverse(ListNode head) {
         ListNode currentNode = head;
         while(currentNode != null && currentNode.next != null) {
             ListNode nextNode = currentNode.next;
             currentNode.next = nextNode.next;
             nextNode.next = head;
             head = nextNode;
         }

         return head;
    }
}
