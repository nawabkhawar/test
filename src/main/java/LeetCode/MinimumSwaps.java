package LeetCode;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
//https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
//7
//7 1 3 2 4 5 6
public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swap=0;
        for(int i=0;i<arr.length;i++){
            int tmp=0;
            int t=i;
        if(arr[i]!=i+1){
            swap++;
            while(arr[t]!=i+1){
               t++;
           }
           tmp = arr[i];
           arr[t] = arr[i];
           arr[i] = tmp;
        }
        }
    return swap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine().trim());
            List<Integer> arr = new ArrayList<>();
                try {
                    arr.addAll(Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(toList()));
                }catch(IOException e){
                    System.out.println("exception while reading array" +  e.getMessage());
                }
           System.out.print("total swaps:" +  MinimumSwaps.minimumSwaps(arr.stream().mapToInt(i->i).toArray()));

        }
        catch(IOException e){
            System.out.println("IOException, {}" + e );
        }

    }


}
