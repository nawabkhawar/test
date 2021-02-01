import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length>0) {
            Integer[] lisArr = new Integer[nums.length];
            Arrays.fill(lisArr, 1);

            for (int i = 1; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i] && lisArr[i] < lisArr[j] + 1) {
                        lisArr[i] = lisArr[j] + 1;
                    }
                }
            }

            int maxLIS = Collections.max(Arrays.asList(lisArr));

            return maxLIS;
        }
        else{
            return 0;
        }
    }

     /*public static void main(String[] args) {
        int[] nums = {10,22,9,33,21,50,41,60};
        System.out.println(new Solution().lengthOfLIS(nums));
    }*/
}