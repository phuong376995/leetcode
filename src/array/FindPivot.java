package array;

/**
 * The problem: https://leetcode.com/problems/find-pivot-index/
 *
 * @author Daily LeetCode Challenge
 * @version 1.0
 * @since 7/28/20
 */

public class FindPivot {

    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        } else if (n == 0) {
            return -1;
        }
        int[] st = new int[n];
        int[] sp = new int[n];

        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            st[i] = i == 0 ? nums[i] : st[i -1] + nums[i];
            sp[j] = j == n - 1 ? nums[j] : sp[j + 1] + nums[j];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (sp[1] == st[0]) {
                    return i;
                }
            } else if (i == n - 1) {
                if (st[i-1] == sp[0]) {
                    return i;
                }
            } else {
                if (st[i -1] == sp[i + 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
