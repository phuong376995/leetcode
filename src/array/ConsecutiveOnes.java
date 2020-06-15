package array;

/**
 * @author nguyenvanphuong6995@gmail.com
 * @version 1.0
 * @since 6/13/20
 */


public class ConsecutiveOnes {

    public static void main(String[] args) {
        int a[] = {1,1,1,0,1,1,1};
        System.out.println(optimizeSolution(a));
    }

    /**
     * Given a binary array, find the maximum number of consecutive 1s in this array.
     * @param nums
     * @return
     */
    public static int solution(int []nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int counter = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 1) {
                        counter++;
                    } else {
                        break;
                    }
                }

                if (counter > max) {
                    max = counter;
                }
            }
        }
        return max;
    }


    /**
     * Given a binary array, find the maximum number of consecutive 1s in this array.
     * @param nums
     * @return
     */
    public static int optimizeSolution(int []nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 1) {
                int counter = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 1) {
                        counter++;
                    } else {
                        break;
                    }
                }

                if (counter > max) {
                    max = counter;
                }

                i += counter;
            } else {
                i ++;
            }
        }
        return max;
    }
}
