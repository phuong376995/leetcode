package array;

/**
 * leetcode: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
 * @author phuong.nguyenvan@vti.com.vn
 * @version 1.0
 * @since 6/17/20
 */


public class CheckDoubleExist {

    public static void main(String[] args) {
//        int[] arr = {10,2,5,3};
//        int[] arr = {7,1,14,11};
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }

    /**
     * Given an array of integers, check if there exist two numbers N and M such that N is the double of M
     * @param arr
     * @return
     */
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == arr[j] * 2) && (i != j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
