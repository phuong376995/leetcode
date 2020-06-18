package array;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/17/20
 */


public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static  int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int m = (left + right) / 2;
            if (nums[m] < target) {
                left = m + 1;
            } else if (nums[m] > target) {
                right = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
