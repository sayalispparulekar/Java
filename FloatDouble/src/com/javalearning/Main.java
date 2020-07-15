package com.javalearning;

public class Main {

    public static void main(String[] args) {
	
        //Long Range
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        
        System.out.println("MINIMUM LONG VALUE = " + minLongValue);
        System.out.println("MAXIMUM LONG VALUE = " + maxLongValue);
        
        System.out.println("-------------------------------------");

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("MINIMUM DOUBLE VALUE = " + minDoubleValue);
        System.out.println("MAXIMUM DOUBLE VALUE = " + maxDoubleValue);

        System.out.println("-------------------------------------");
        
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println("INTEGER VALUE = " + myIntValue);
        System.out.println("FLOAT VALUE = "+ myFloatValue);
        System.out.println("DOUBLE VALUE = " + myDoubleValue);
    }
}
