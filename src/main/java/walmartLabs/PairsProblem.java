package walmartLabs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairsProblem {

    public void getAssociations(List<Pair> allPairs){
        Map finalMap = new HashMap<String, ArrayList>();

        for(Pair pair: allPairs){
            if(finalMap.containsKey(pair.getKey())){

                finalMap.get(pair.getKey());

            }else if(finalMap.containsKey(pair.getValue())){

            }
        }
    }

    public static void main(String args[]){
        List<Pair> allPairs = new ArrayList<>();

    }

    /*
    Nokia -> Alcatel Lucent 
    Nokia -> Siemens 	 
    Walmart -> Flipkart 
    Flipkart -> PhonePe 
    Myntra->Flipkart 
    Flipkart -> Jabong 	 
    Uber -> Uber Eats  
    Uber Eats -> Zomato 
     */
}
