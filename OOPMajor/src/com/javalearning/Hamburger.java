package com.javalearning;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;


    public Hamburger(String name, String meat, double price,String breadRollType){
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void addAddition1(String name, double price){
        this.addition1 = name;
        this.addition1Price = price;
    }
    public void addAddition2(String name, double price){
        this.addition2 = name;
        this.addition2Price = price;
    }
    public void addAddition3(String name, double price){
        this.addition3 = name;
        this.addition3Price = price;
    }
    public void addAddition4(String name, double price){
        this.addition4 = name;
        this.addition4Price = price;
    }
    public double additions(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " with " + this.meat+  " costs " + this.price );
        if(this.addition1 != null){
            hamburgerPrice += this.addition1Price;
            System.out.println(this.addition1 + " added extra for " + this.addition1Price);
        }
        if(this.addition2 != null){
            hamburgerPrice += this.addition2Price;
            System.out.println(this.addition2 + " added extra for " + this.addition2Price);
        }
        if(this.addition3 != null){
            hamburgerPrice += this.addition3Price;
            System.out.println(this.addition3 + " added extra for " + this.addition3Price);
        }
        if(this.addition4 != null){
            hamburgerPrice += this.addition4Price;
            System.out.println(this.addition4 + " added extra for " + this.addition4Price);
        }
        return hamburgerPrice;

    }
}
