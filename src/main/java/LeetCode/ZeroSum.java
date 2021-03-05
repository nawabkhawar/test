package LeetCode;

public class ZeroSum {
        // Function to print all subarrays with a zero-sum
        // in a given array
        public static void printallSubarrays(int[] A)
        {

            // consider all subarrays starting from `i`
           for(int i=0;i<A.length;i++){
               int sum=0;
               for(int j=i;j<A. length;j++){
                   sum+=A[j];
                   if(sum==0){
                       System.out.println("subArray: [" + i + "..." + j + "]");
                   }
               }
           }
        }

        public static void main (String[] args)
        {
            //int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
            int[] A ={6, 3, -1, -3, 4, -2, 2,
                4, 6, -12, -7};
            /*
            subArray: [0...2]
            subArray: [0...9]
            subArray: [1...3]
            subArray: [2...5]
            subArray: [3...9]
            subArray: [5...7]
             */
            printallSubarrays(A);
        }
    }

