package com.javalearning;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        filterVowels(input);
        filterConsonants(input);

        System.out.println("\nEnter the count of numbers : ");
        int count = sc.nextInt();
        int[] order = new int[count];
        System.out.println("Enter the numbers :");
        for(int i = 0; i< order.length; i++){
            order[i] = sc.nextInt();
        }
        ascending(order);
        descending(order);

        System.out.println("\nEnter a number :");
        int number =  sc.nextInt();
        primeNumbers(number);

        System.out.println("\nEnter a number :");
        int number2 =  sc.nextInt();
        primeNumbers(number2);

        System.out.println("\nEnter a number :");
        int number3 =  sc.nextInt();
        evenOdd(number3);

        System.out.println("\nEnter a number :");
        int number4 =  sc.nextInt();
        evenOdd(number4);
    }

    public static String filterVowels(String input){

        input = input.toLowerCase();
        String w_vowels = input.replaceAll("[aeiou]", "");
        System.out.println(w_vowels);
        return(w_vowels);

    }
    public static String filterConsonants(String input){

        input = input.toLowerCase();
        String w_consonants = input.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
        System.out.println(w_consonants);
        return(w_consonants);

    }
    public static void ascending(int[] order){
        for(int j = 0 ; j < order.length - 1 ; j++){
            for (int l = j+1; l < order.length; l++) {
                if(order[j] > order[l]){
                    int temp = order[j];
                    order[j] = order[l];
                    order[l] = temp;
                }
            }

        }
        System.out.println("Ascending order :");
        for(int k = 0 ; k< order.length; k++){

            System.out.println(order[k]);
        }
    }
    public static void descending(int[] order){
        for(int j = 0 ; j < order.length - 1 ; j++){
            for (int l = j+1; l < order.length; l++) {
                if(order[j] < order[l]){
                    int temp = order[j];
                    order[j] = order[l];
                    order[l] = temp;
                }
            }

        }
        System.out.println("\nDescending order : ");
        for(int k = 0 ; k< order.length; k++){

            System.out.println(order[k]);
        }
    }
    public static void primeNumbers(int number){
        for(int m = 2 ; m < number ; m++){
             if( number % m == 0){
                 System.out.println("\nNot Prime");
             }else{
                 System.out.println("\nPrime");
             }
            break;

        }

    }
    public static void evenOdd(int number){
            if( number % 2 == 0){
                System.out.println("\nEven");
            }else{
                System.out.println("\nOdd");
            }

    }
}
