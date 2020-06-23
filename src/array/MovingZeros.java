package array;

/**
 * TODO
 * The problem: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/23/20
 */

public class MovingZeros {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    /**
     * Given an array of integers, write a function to move all 0 to end of it while remaining the relative order of
     * non-zero elements.
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int tail = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == tail) {
                break;
            }
            if (nums[i] == 0) {
                int temp = nums[i];
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length-1] = temp;
                i--;
                tail --;
            }
        }
    }
}
