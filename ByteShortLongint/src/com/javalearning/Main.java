package com.javalearning;

public class Main {

    public static void main(String[] args) {

        //Wrapper Class Integer
        int minIntegerValue = Integer.MIN_VALUE;
        int maxIntegerValue = Integer.MAX_VALUE;

        //Integer range
        System.out.println("MINIMUM INTEGER VALUE = " + minIntegerValue);
        System.out.println("MAXIMUM INTEGER VALUE = " + maxIntegerValue);

        System.out.println("\n------------------------------------------\n");

        System.out.println("BUSTED MINIMUM VALUE = " + (minIntegerValue - 1));  //Underflow
        System.out.println("BUSTED MAXIMUM VALUE = " + (maxIntegerValue + 1));  //Overflow

        System.out.println("\n------------------------------------------\n");

        //Wrapper Class Byte
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        //Byte range
        System.out.println("MINIMUM BYTE VALUE = " + minByteValue);
        System.out.println("MAXIMUM BYTE VALUE = " + maxByteValue);

        System.out.println("\n------------------------------------------\n");

        //Wrapper Class Short
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        //Short range
        System.out.println("MINIMUM SHORT VALUE = " + minShortValue);
        System.out.println("MAXIMUM SHORT VALUE = " + maxShortValue);

        System.out.println("\n------------------------------------------\n");

        //Wrapper Class Long
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        //Long range
        System.out.println("MINIMUM LONG VALUE = " + minLongValue);
        System.out.println("MAXIMUM LONG VALUE = " + maxLongValue);

        System.out.println("\n------------------------------------------\n");
        
        int newIntValue = minIntegerValue/2;
        byte newByteValue = (byte) (minByteValue/2);
        short newShortValue = (short) (minShortValue/2);

        System.out.println(newIntValue);
        System.out.println(newByteValue);
        System.out.println(newShortValue);




    }
}
