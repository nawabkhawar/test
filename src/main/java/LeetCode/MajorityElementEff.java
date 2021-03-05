package LeetCode;

public class MajorityElementEff {
    //https://leetcode.com/problems/majority-element/submissions/
    //moore's voting algorithm
    public static int majorityElement(int[] nums) {

        int count=1,maj=nums[0],ctr=0;
        for(int i=0;i<nums.length;i++){
            if(maj==nums[i])
                count++;
            else
                count--;
            if(count==0){
                count=1;
                maj=nums[i];
            }
        }
        for(int n:nums){
            if(maj==n)
                ctr++;
        }
        return (ctr>nums.length/2)?maj:-1;
    }

    public static void main(String[] args)
    {

        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;

        // Function calling
        System.out.println(majorityElement(arr));
    }
}
