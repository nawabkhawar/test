package LeetCode;

public class Bitcount
{
    public static void main(String args[]){
        System.out.print("next bit: " + nextWithSameBitCount(4));
    }

    public static int nextWithSameBitCount(int i) {
        int bitCount = Integer.bitCount(i);
        System.out.println("bitcount:" + bitCount);
        do {
            i++;
        } while(Integer.bitCount(i) != bitCount);
        return i;
    }

}
