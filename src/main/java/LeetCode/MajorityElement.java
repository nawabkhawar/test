package LeetCode;

class MajorityElement {

    // Function to find Majority element
    // in an array
    static void findMajority(int arr[], int n)
    {
        int maxCount =0;
        int index=0;

        for(int i=0;i<arr.length;i++){
            int countOfJ =0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    countOfJ++;
                }
                if(countOfJ>maxCount){
                    maxCount = countOfJ;
                    index = i;
                }
            }
        }
        if(maxCount> arr.length/2){
            //majority element found
            System.out.print("majority element : " + arr[index] + " with frequency - " + maxCount );
        }
        else{
            System.out.print("no majority element found");
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;

        // Function calling
        findMajority(arr, n);
    }
    // This code is contributed by ajit.
}
