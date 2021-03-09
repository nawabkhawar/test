package com.Maps;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private int abc;

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    @Override
    public int compareTo(Student o) {
        if(this.abc>o.abc)
            return 1;
        else
            return -1;
    }
}
