package array;

/**
 * The problem: https://leetcode.com/problems/plus-one/
 *
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 8/2/20
 */

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9};
        plusOne(digits);
    }

    /**
     * Given a non empty array representing a not negate integer number,
     * plus one to the number
     * assume the integer don't contain any leading zero, except the number 0 itself
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] newDigits = new int[n + 1];
        int surplus = 0;
        for (int i = n - 1; i >= 0; --i) {
            int currentDigits = i == n - 1 ? digits[i] + 1 + surplus : digits[i] + surplus;
            surplus = 0;
            if (currentDigits < 10) {
                newDigits[i + 1] = currentDigits;
            } else {
                newDigits[i + 1] = currentDigits % 10;
                surplus = 1;
                if (i == 0) {
                    newDigits[i] = currentDigits / 10;
                }
            }
        }
        if (newDigits[0] == 0) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = newDigits[i + 1];
            }
            return result;
        }
        return newDigits;
    }
}
