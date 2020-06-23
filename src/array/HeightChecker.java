package array;

import java.util.Arrays;

/**
 * TODO
 * The problem: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/23/20
 */

public class HeightChecker {

    public static void main(String[] args) {

//        int[] heights = {1,1,4,2,1,3};
//        int[] heights = {5,1,2,3,4};
        int[] heights = {1,2,3,4,5};
        System.out.println(heightChecker(heights));

    }

    /**
     *
     * @param heights
     * @return
     */
    public static int heightChecker(int[] heights) {
        int[] duplicateHeights = Arrays.copyOf(heights, heights.length);
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+ 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != duplicateHeights[i]) {
                counter++;
            }
        }
        return counter;
    }
}
