package stack;


/**
 * The problem: https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1361/
 *
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 8/9/20
 */

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("["));
//        System.out.println(isValid("([]){}"));
//        System.out.println(isValid("{[(])}"));
    }

    static class Stack {
        private Node topNode;

        public void push(char value) {
            Node newNode = new Node(value);
            if (!isEmpty()) {
                newNode.next = topNode;
            }
            topNode = newNode;
        }

        public char pop() {
            char result = topNode.value;
            topNode = topNode.next;
            return result;
        }

        private boolean isEmpty() {
            return topNode == null;
        }
    }

    static class Node {
        Node next;
        char value;

        Node(char value) {
            this.value = value;
            this.next = null;
        }
    }

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char value = s.charAt(i);
            if (value == '[' || value == '(' || value == '{') {
                stack.push(value);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char previousValue = stack.pop();
                if ((previousValue == '[' && value == ']')
                        || (previousValue == '(' && value == ')')
                        || (previousValue == '{' && value == '}')) {

                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
