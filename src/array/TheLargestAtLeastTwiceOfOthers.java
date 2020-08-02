package array;

/**
 * The problem: https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 *
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 8/2/20
 */

public class TheLargestAtLeastTwiceOfOthers {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,1};
        dominantIndex(nums);
    }

    /**
     * In the given integer array, there is always exactly one largest number.
     * Find whether the largest number in the array is at least twice as big as every other element in the array
     * If it is, return the index of the largest element, otherwise return -1
     *
     * @param nums
     * @return
     */
    public static int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] max = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max[0]) {
                max[1] = max[0];
                max[0] = nums[i];
                index = i;
            } else if (nums[i] > max[1]) {
                max[1] = nums[i];
            }
        }
        if (max[0] >= (max[1] * 2)) {
            return index;
        }
        return -1;
    }
}
