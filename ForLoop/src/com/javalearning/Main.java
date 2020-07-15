package com.javalearning;

public class Main {

    public static void main(String[] args) {
	    for(double i = 2; i<=8 ; i++){
	        double interest = calculateInterest(10000, i);
	        System.out.println(interest);
        }
   }

    public static double calculateInterest(double amount, double interestRate ){

        double interest = (amount * (interestRate/100));
        return(interest);
    }


}
