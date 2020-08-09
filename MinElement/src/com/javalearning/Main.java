package com.javalearning;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count : ");
        int count = scanner.nextInt();
        System.out.println("Enter " + count + " numbers : ");
        int[] myArray  = new int[count];
        myArray = readIntegers(count);
        findMin(myArray);
    }
    public static int[] readIntegers(int count){
        int[] values = new int[count];
        for(int i = 0; i < count; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int findMin(int[] array){
        int min = 0;
        for(int i = 0; i< array.length-1; i++){
            if(array[i] < array[i+1]){
                min = array[i];
            }
        }
        System.out.println("Minimum element = " + min);
        return min;
    }
}
