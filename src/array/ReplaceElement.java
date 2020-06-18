package array;

/**
 * TODO
 * The problem: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/18/20
 */

public class ReplaceElement {

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    /**
     * Given an array of integer arr, replace every element in that array with the greatest element
     * among the elements to its right and replace the last element with -1
     * @param arr
     * @return
     */
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                arr[i] = -1;
            } else {
                int max = -1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }
        return arr;
    }
}
