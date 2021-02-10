package LeetCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Staircase {
        // Complete the staircase function below.
        static void staircase(int n) {
            if(n==0||n>100){
                System.out.print("exceeding");
            }else{
                for(int total=1;total<=n;total++){
                    for(int space=1;space<=n-total;space++){
                        System.out.print(" ");
                    }
                    for(int hashC=1;hashC<=total;hashC++){
                        System.out.print("#");
                    }
                    System.out.println("");
                }

            }
            }


        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            staircase(n);

            scanner.close();
        }
    }
