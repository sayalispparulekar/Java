package com.javalearning;

public class Main {

    public static void main(String[] args) {

        String myString = "Hello There!!!!";

        System.out.println("THE FIRST STRING IS : " + myString);
        System.out.println("THE SECOND STRING IS : " + (myString + "How are you?"));
        System.out.println("THE THIRD STRING IS  : " + (myString + " \u00A9 2020"));

        System.out.println("\n-------------------------------------------\n");
        String myNumberString = "250";
        System.out.println("NUMBER STRING = " + myNumberString);
        System.out.println("SECOND NUMBER STRING = " + (myNumberString + 10));

        int intString = 200;
        System.out.println("THIRD NUMBER STRING = " + (myNumberString + intString));

    }
}
