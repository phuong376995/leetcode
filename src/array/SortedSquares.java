package array;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/15/20
 */


public class SortedSquares {

    public static void main(String[] args) {
//        int[] a = {-4,-1,0,3,10};
        int[] a = {-7,-3,2,3,11};
        a = squareAndSort(a);

        for (int i : a) {
            System.out.printf(i + ",");
        }
    }

    /**
     * Given an array of integers A sorted in non-decreasing order, return an array of square of each number,
     * also in sorted no decreasing order
     * @param A
     * @return
     */
    public static int[] squareAndSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i+ 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }
}
