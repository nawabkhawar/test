package com.designpatters.creational.factory;

public class PersonFactory {

    public Person getPerson(Character gender, String name){
        if(gender.equals('M')){
            return new Male(name);
        }else if(gender.equals('F')){
            return new Female(name);
        }
        else return new Person(name);
    }

}
