package array;

/**
 * TODO
 * The problem: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
 * @author nguyenvanphuong6995@gmail.
 * @version 1.0
 * @since 6/21/20
 */

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        sortArrayByParity(A);
        for (int i : A) {
            System.out.println(i);
        }
    }

    /**
     * Given an array of non-negative integers A, return an array consisting all elements of A, followed by all the od
     * element of A
     * @param A
     * @return
     */
    public static int[] sortArrayByParity(int[] A) {
        int tail = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (i == tail) {
                break;
            }
            if (A[i] % 2 != 0) {
                int temp = A[i];
                for (int j = i; j < A.length - 1; j++) {
                    A[j] = A[j + 1];
                }
                A[A.length-1] = temp;
                i--;
                tail --;
            }
        }
        return A;
    }
}
