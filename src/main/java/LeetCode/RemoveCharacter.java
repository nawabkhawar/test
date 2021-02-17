package LeetCode;


import java.util.Arrays;
import java.util.Locale;

public class RemoveCharacter {

    public static String removeChar(String str){
        String newString[] = str.split("_");
        String stringBuffer = new String();
        for(String newS: newString){
            //first char uppercase
            String firstChar = newS.substring(0,1);
            String remainingString = newS.substring(1,newS.length());
            stringBuffer += firstChar.toUpperCase() + remainingString;
        }
        return stringBuffer;
    }

    public static void main(String args[]){
        System.out.println(removeChar("this_is_variable"));
    }

}
