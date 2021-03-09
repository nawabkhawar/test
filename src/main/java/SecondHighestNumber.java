import java.util.ArrayList;
import java.util.List;

public class SecondHighestNumber {

    public static int findSecondLargest(List<Integer> arr){
        int max=0;
        int max2=0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                if(max>max2){
                    max2 = max;
                }
                max= arr.get(i);

            }else if(arr.get(i)>max2) {
                max2 = arr.get(i);
            }

        }


        return max2;
    }

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(11);
        arr.add(20);
        arr.add(9);
        arr.add(5);

        System.out.println("second largest number is: "+ findSecondLargest(arr));
    }


}
