package com.designpatters.creational.builder;

public class Phone {

    public Phone(int price, int sim, String model, String company, String os) {
        this.price = price;
        this.sim = sim;
        this.model = model;
        this.company = company;
        this.os = os;
    }

    private int price;
    private int sim;
    private String model;
    private String company;
    private String os;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", sim=" + sim +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
