package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Java program to find k closest elements to a given value
    class KClosest
    {
        // Function to find the `k` closest elements to `x` in a sorted list `arr`
        public static List<Integer> findKClosestElements(List<Integer> arr, int k, int x)
        {
            // find the insertion point using the binary search algorithm
            int i = Collections.binarySearch(arr, x);

            // Collections.binarySearch() returns `-(insertion point) - 1`
            // if the key is not contained in the list

            if(i<0){
                i= -(i+1);
            }
            List<Integer> finalArr = new ArrayList<>();
            int left =i-1;
            int right = i;
            while(k>0){
                if((left<0) || (right<arr.size() && (Math.abs(arr.get(left)-x)) > Math.abs(arr.get(right)-x))){
                    finalArr.add(arr.get(right));
                    right++;
                }else{
                    finalArr.add(arr.get(left));
                    left--;
                }
                k--;
            }
            return finalArr;
        }

        public static void main(String[] args) {

            List<Integer> arr = Arrays.asList(10, 12, 13, 17, 18,19, 20, 25);
            int x = 16, k = 3;

            System.out.println(findKClosestElements(arr, k, x));
        }
    }


