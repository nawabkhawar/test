package com.designpatters.creational.factory;

public class FactoryPatternMain {

    public static void main(String args[]){
        Person personObj = new PersonFactory().getPerson('M',"nawab");
        System.out.println(personObj.getClass());
    }
}
