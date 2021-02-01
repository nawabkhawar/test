package com.designpatters.creational.builder;

public class BuilderTest {

    public static void main(String args[]){
        Phone phoneObj = new Phone(36000,2,"2014","apple","ios");
        System.out.println(phoneObj);

        Phone phoneObj2 = new PhoneBuilder().setModel("2015").setCompany("samsung")
                .setPrice(28000).getPhone();
        System.out.println(phoneObj2);


    }


}
