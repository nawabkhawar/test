package com.interviewquestions.comparatorvscomparable;

import java.util.Objects;

public class SampleObj implements Comparable<SampleObj> {

    private Integer ram;
    private Integer cost;
    private String name;

    public SampleObj(Integer ram, Integer cost, String name) {
        this.ram = ram;
        this.cost = cost;
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(SampleObj o) {
        if(this.ram> o.ram){
            return 1;
        }else{
            return -1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleObj sampleObj = (SampleObj) o;
        return ram.equals(sampleObj.ram) &&
                cost.equals(sampleObj.cost) &&
                name.equals(sampleObj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, cost, name);
    }

    @Override
    public String toString() {
        return "SampleObj{" +
                "ram=" + ram +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
