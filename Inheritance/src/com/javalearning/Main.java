package com.javalearning;

public class Main {

    public static void main(String[] args) {

            Porsche porsche = new Porsche("Black");
            porsche.accelerate(20);
            System.out.println("--------------------------------");
            porsche.steer(45);
            System.out.println("--------------------------------");
            porsche.accelerate(30);
            System.out.println("--------------------------------");
            porsche.accelerate(-34);

    }
}
