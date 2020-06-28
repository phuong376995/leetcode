package array;

import java.util.LinkedList;
import java.util.List;

/**
 * The problem: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/28/20
 */

public class FindDisappearedNumbers {

    public static void main(String[] args) {

    }

    /**
     * Given an array where 1 <= a[i] <=n, some elements appear twice, and others appear one
     * Find all elements of [1,n] that do not appear in this array.
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<>();
        boolean[] flags = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            flags[nums[i]] = true;
        }
        for (int i = 1; i < flags.length; i++) {
            if (!flags[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
