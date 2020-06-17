package array;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/15/20
 */


public class MergeArray {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
//        int m = 1;
//        int n = 1;
//        int[] nums1 = {2,0};
//        int[] nums2 = {1};

        merge(nums1, m, nums2, n);
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    /**
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            int index = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (nums2[i] >= nums1[j]) {
                    index = j + 1;
                    break;
                }
            }
            if (index == m) {
                nums1[m] = nums2[i];
            } else {
                for (int k = m; k > index; k--) {
                    nums1[k] = nums1[k-1];
                }
                nums1[index] = nums2[i];
            }
            m++;
        }
    }
}
