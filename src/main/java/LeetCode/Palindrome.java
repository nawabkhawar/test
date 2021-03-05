package LeetCode;

// Java implementation of O(n^2)
// time and O(1) space method
// to find the longest palindromic substring
public class Palindrome {
    // A utility function to print
    // a substring str[low..high]
    static void printSubStr(String str,
                            int low, int high)
    {
        System.out.println(
                str.substring(
                        low, high + 1));
    }

    // This function prints the
    // longest palindrome substring
    // (LPS) of str[]. It also
    // returns the length of the
    // longest palindrome
    static int longestPalSubstr(String str)
    {
       int maxLength=0;

       for(int i=0;i<str.length();i++){
           int count=0;
           //odd case
           int left = i-1;
           int right = i+1;
           while((left>0 && right< str.length()) && (str.charAt(left)==str.charAt(right))){
               if(right-left+1>maxLength){
                   maxLength= right-left+1;
               }
               left--;
               right++;
           }

           //even case
           int leftEven = i-1;
           int rightEven = i;
           while((leftEven>0 && rightEven< str.length()) && (str.charAt(leftEven)==str.charAt(rightEven))){
               if(rightEven-leftEven+1>maxLength){
                   maxLength= rightEven-leftEven+1;
               }
               leftEven--;
               rightEven++;
           }

       }

        return maxLength;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {

        String str = "forgeeksskeegfor";
        System.out.println("Length is: " + longestPalSubstr(str));
    }
}
// This code is contributed by Sumit Ghosh

