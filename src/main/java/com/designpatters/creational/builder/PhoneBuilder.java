package com.designpatters.creational.builder;

public class PhoneBuilder {

    private int price;
    private int sim;
    private String model;
    private String company;
    private String os;

    public PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setSim(int sim) {
        this.sim = sim;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone getPhone(){
        return new Phone(this.price, this.sim, this.model, this.company, this.os);
    }


}
