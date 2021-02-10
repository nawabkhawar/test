package LeetCode;



    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

        // Complete the compareTriplets function below.
        static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> newList = new ArrayList<>();
        int sumA =0, sumB=0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
                sumA++;
            }else if(b.get(i)>a.get(i)){
                sumB++;
            }
        }

        newList.add(sumA);
        newList.add(sumB);
        return newList;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = compareTriplets(a, b);
            System.out.println(result);


            /*bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );*/

            bufferedReader.close();
            //bufferedWriter.close();
        }


}
