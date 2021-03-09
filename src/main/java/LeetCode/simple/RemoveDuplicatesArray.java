package LeetCode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesArray {


        public static int removeDuplicates(int[] nums) {

            if(nums.length==0) return 0;
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=nums[j]){
                    nums[++j] = nums[i];
                }
            }
        return ++j;
        }

        public static void main(String args[]){
            int[] nums = {4,4,6,7,8,8,10};
            //int[] nums = {1,1,2};
            System.out.println("removedDuplicates:" + removeDuplicates(nums));
        }

}
