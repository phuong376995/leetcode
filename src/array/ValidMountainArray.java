package array;

/**
 * TODO
 * Problem: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/17/20
 */

public class ValidMountainArray {

    public static void main(String[] args) {
//        int[] A = {1, 3, 2};
        int[] A = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
//        int[] A = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(validMountainArray(A));

    }

    /**
     * Given an array of integers A, return if and only if it is a valid mountain array
     * @param A
     * @return
     */
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int index = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                return false;
            } else if (A[i] > A[i + 1]) {
                index = i + 1;
                break;
            }
        }
        if (index == 1) {
            return false;
        }
        for (int i = index; i < A.length -1; i ++) {
            if (A[i] <= A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
