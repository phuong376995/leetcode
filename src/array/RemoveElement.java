package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author phuong.nguyenvan@vti.com.vn
 * @version 1.0
 * @since 6/16/20
 */


public class RemoveElement {

    public static void main(String[] args) {
//        int[] nums = {3,2,2,3};
//        int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = {-3,-1,0,0,0,3,3};
        int val = 2;
        int length = removeElement(nums, val);

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    /**
     * Given an array nums and a value val, remove all instances of that value and return the new length
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                length--;
                i--;
            }
        }
        return length;
    }

    /**
     * Given a sorted array of integer nums, remove the duplicates such that each element appear only once and return the new length
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort(Integer::compareTo);

        for (int i = 0; i < keys.size(); i++) {
            nums[i] = keys.get(i);
        }

        return map.size();
    }
}

