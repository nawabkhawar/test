package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class MinimumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int tmp=0;
        int swap=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]!=i+1){
            int j=i;
            while(arr[j]!=i+1){
                j++;
            }
            //change variables
            tmp= arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            swap++;
        }
        }
        return swap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int size = Integer.parseInt(br.readLine().trim());
        }catch(IOException e){
            System.out.println("IO Exception: "  + e);
        }

        List<Integer> arr = new ArrayList<>();
        try {
            arr.addAll(Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(toList()));
        }catch(IOException e){
            System.out.println("IO Exception in reading second line: " + e);
        }
        System.out.println(minimumSwaps(arr.stream().mapToInt(i->i).toArray()));
    }


}
