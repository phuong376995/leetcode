package array;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/15/20
 */


public class NumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    /**
     * Given an array of integer, return how many of them contain an even number of digits
     * @param nums
     * @return
     */
    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = 1;
            while ((nums[i] / 10) != 0) {
                length ++;
                nums[i] /= 10;
            }

            if (length % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
