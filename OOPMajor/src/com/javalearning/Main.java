package com.javalearning;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 78.00, "Brown");
        double price = hamburger.additions();

        hamburger.addAddition1("Lettuce", 3.56);
        hamburger.addAddition2("Carrot", 2.78);
        System.out.println("Total burger price = " + hamburger.additions());

        System.out.println("-------------------------------------------");


        HealthyBurger healthyBurger = new HealthyBurger("Lentils", 80.00);
        healthyBurger.addAddition5("Egg", 3.67);
        healthyBurger.addAddition6("Bacon", 2.38);
        System.out.println("Total healthy hamburger price = " + hamburger.additions() );

    }
}
