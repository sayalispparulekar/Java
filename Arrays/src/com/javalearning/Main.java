package com.javalearning;
import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);
        sortIntegers(myArray);

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " values :");
        int[] values = new int[number];
        for(int i=0; i<values.length ; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println("Element no. " + i + " = " +array[i]);
        }
        System.out.println("-------------------------");
    }
    public static int[] sortIntegers(int[] array){

        for(int i = 0; i < array.length  ; i++){
            for(int j = 0; j< array.length - 1; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.println("Sorted Array :");
        printArray(array);
        return array;

    }
}
