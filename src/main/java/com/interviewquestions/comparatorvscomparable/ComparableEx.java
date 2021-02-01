package com.interviewquestions.comparatorvscomparable;

import java.util.ArrayList;
import java.util.List;

public class ComparableEx {

    public List<SampleObj> getAList(){
        List sampleObjects = new ArrayList();

        sampleObjects.add(new SampleObj(12,1200, "a1"));
        sampleObjects.add(new SampleObj(8,1400, "a3"));
        sampleObjects.add(new SampleObj(16,200, "a2"));
        return sampleObjects;
    }


}
