package LeetCode;

public class LongestCommonSubstring {

        public static void main(String[] args) {
            String str1="Java2blog";
            String str2="CoreJavaTutorial";
            String X = "OldSite:GeeksforGeeks.org";
            String Y = "NewSite:GeeksQuiz.com";
            LongestCommonSubstring lcsMain=new LongestCommonSubstring();
            System.out.println("String 1: "+str1);
            System.out.println("String 2: "+str2);
            System.out.println("Longest common subString is: " +lcsMain.getLongestCommonSubstring(str1, str2));

        }
        public String getLongestCommonSubstring(String str1, String str2){
            int m = str1.length();
            int n= str2.length();

            int arr[][] = new int[m][n];
            int maxValue =0;
            int index =0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        if(i==0 || j==0){
                            arr[i][j] = 1;
                        }else{
                            arr[i][j] = arr[i-1][j-1] + 1;
                        }
                    if(arr[i][j]>maxValue){
                        maxValue = arr[i][j];
                        index = i;
                    }
                    }
                }
            }
            return str1.substring(index-maxValue+1, maxValue);
        }
}
