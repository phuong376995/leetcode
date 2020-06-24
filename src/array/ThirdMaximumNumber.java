package array;

/**
 * TODO
 * The problem: https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3231/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/23/20
 */

public class ThirdMaximumNumber {

    public static void main(String[] args) {
//        int[] nums = {3, 2, 1};
//        int[] nums = {1,2,-2147483648};
//        int[] nums = {1, 2};
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));

    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        OUTER: for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (j < maxArr.length) {
                if (nums[i] == maxArr[j]) {
                    continue OUTER;
                } else if (nums[i] > maxArr[j]) {
                    break;
                } else {
                    j++;
                }
            }
            if (j < maxArr.length) {
                for (int k = maxArr.length - 1; k > j; k--) {
                   maxArr[k] = maxArr[k-1];
                }
                maxArr[j] = nums[i];
            }
        }

        if (maxArr[2] == Long.MIN_VALUE) {
            return (int)maxArr[0];
        }

        return (int)maxArr[2];
    }
}
