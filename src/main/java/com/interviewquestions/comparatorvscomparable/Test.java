package com.interviewquestions.comparatorvscomparable;

import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String args[]){
        ComparableEx comparableEx = new ComparableEx();
        List<SampleObj> sampleObjList = comparableEx.getAList();

        //Collections.sort(sampleObjList, Collections.reverseOrder());
        Collections.sort(sampleObjList);
        sampleObjList.stream().forEach(x->System.out.println(x));
    }
}
