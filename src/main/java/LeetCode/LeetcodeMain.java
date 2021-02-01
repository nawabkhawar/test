package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LeetcodeMain {

    public static void main(String args[]){
        System.out.println("Hi");
        //System.out.print(new Solution().lengthOfLongestSubstring("pwwkew")); //3
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb")); //3
        System.out.println(new Solution().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new Solution().lengthOfLongestSubstring("  "));
        System.out.println(new Solution().lengthOfLongestSubstring("abcdefgh"));//8
        System.out.println(new Solution().lengthOfLongestSubstring("a"));//1
        System.out.println(new Solution().lengthOfLongestSubstring("ab"));//2
        System.out.println(new Solution().lengthOfLongestSubstring("aa"));//1
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbbabcdef")); //6
        System.out.println(new Solution().lengthOfLongestSubstring("baa"));//2
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));

    }
}
class Solution {
    public  int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int max =0;
        HashMap<Character, Integer> lastIndexMap =new HashMap<Character, Integer>();
        boolean occurred = false;
        for(int i=0, lastIndex=0;i<s.length();i++){

            if(lastIndexMap.containsKey(s.charAt(i))){
                if(!occurred)
                {
                    //first 2nd occurence - if first second occurence
                    //than max should be calculated first for baa scenario
                    max = Integer.max(max,(i-lastIndex) );
                    lastIndex=Integer.max(lastIndex, lastIndexMap.get(s.charAt(i)));
                }else{
                    lastIndex=Integer.max(lastIndex, lastIndexMap.get(s.charAt(i)));
                }
                //occurred before
                occurred = true;


            }

            //added index
            lastIndexMap.put(s.charAt(i),i);
            max = Integer.max(max,(i-lastIndex) );
        }
        if(!occurred){
            return s.length();
        }
        //System.out.println(lastIndexMap);

        return max;
    }


   /* public  int lengthOfLongestSubstring(String s) {
        HashSet hash1 = new HashSet<String>();
        int max = 0;
        boolean matched = false;
        if(s.length()==1){
            return 1;
        }else {
        for(int i=0;i<s.length();i++){

                int letterCount = 1;
                int j = i + 1;

                while (j < s.length() && ((s.charAt(j) != s.charAt(i)))) {
                    //found 2 equals
                    letterCount++;
                    j++;

                }
                if (j < s.length() && (s.charAt(j) == s.charAt(i))) {
                    matched =true;
                    if (max < letterCount) {
                        max = letterCount;
                    }
                }

                //System.out.print(s.charAt(i));
            }
            if(!matched){
                return s.length();
            }
        }
        return max;
    }*/
}
