package linkedlist;

/**
 * @author phuong.nguyenvan@vti.com.vn
 * @version 1.0
 * @since 6/29/20
 */

public class MyLinkedList {


    private SinglyListNode head;

    private class SinglyListNode {

        int val;

        SinglyListNode next;

        SinglyListNode(int x) { val = x; }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public SinglyListNode getNext() {
            return next;
        }

        public void setNext(SinglyListNode next) {
            this.next = next;
        }
    }



    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        SinglyListNode tempNode = this.head;
        int count = 0;
        while (tempNode != null) {
            if (count == index) {
                return tempNode.val;
            }

            tempNode = tempNode.next;
            count ++;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        SinglyListNode newNode = new SinglyListNode(val);
        newNode.next = this.head;
        this.head = newNode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        SinglyListNode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.next == null) {
                SinglyListNode newNode = new SinglyListNode(val);
                tempNode.next = newNode;
                return;
            }
            tempNode = tempNode.next;
        }

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else {
            SinglyListNode currentNode = this.head;
            int count = 0;
            while (currentNode != null) {
                if (count == index -1) {
                    SinglyListNode newNode = new SinglyListNode(val);
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    return;
                }
                count++;
                currentNode = currentNode.next;
            }

            if (count == index) {
                addAtTail(val);
            }
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        SinglyListNode currentNode = this.head;
        SinglyListNode previousNode = null;
        int count = 0;
        while (currentNode != null) {
            if (count == index) {
                if (index == 0) {
                    this.head = head.next;
                } else {
                    previousNode.next = currentNode.next;
                }
                return;
            }
            count ++;
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
}
