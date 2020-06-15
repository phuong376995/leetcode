package array;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/15/20
 */


public class DuplicateZeros {

    public static void main(String[] args) {
//        int[] arr = {1,0,2,3,0,4,5,0};
        int[] arr = {1,2,3};
        duplicateZeros(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * Given a fixed length array of integers, duplicate occurrence of zero, shifting the remaining elements to the right
     * @param arr
     */
    public static void duplicateZeros(int[] arr) {
        int[] duplicateArr = new int[10000];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (counter == arr.length) {
                break;
            }
            duplicateArr[counter++] = arr[i];
            if (arr[i] == 0) {
                duplicateArr[counter++] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = duplicateArr[i];
        }
    }
}
