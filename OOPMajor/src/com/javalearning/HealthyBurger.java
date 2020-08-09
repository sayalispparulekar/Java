package com.javalearning;

public class HealthyBurger extends Hamburger {
    private String addition5;
    private double addition5price;
    private String addition6;
    private double addition6price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price,"Brown rye");
    }
    public void addAddition5(String name, double price){
        this.addition5 = name;
        this.addition5price = price;
    }
    public void addAddition6(String name, double price){
        this.addition6 = name;
        this.addition6price = price;
    }

    @Override
    public double additions() {
        double hamburgerPrice = super.additions();
        if(this.addition5 != null){
            hamburgerPrice += this.addition5price;
            System.out.println(this.addition5 + " added extra for " + this.addition5price);
        }
        if(this.addition6 != null){
            hamburgerPrice += this.addition6price;
            System.out.println(this.addition6 + " added extra for " + this.addition6price);
        }
        return hamburgerPrice;
    }
}
