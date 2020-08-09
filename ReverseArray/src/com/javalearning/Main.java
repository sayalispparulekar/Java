package com.javalearning;
import java.util.Scanner;

import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count : ");
        int count = scanner.nextInt();
        int[] myArray = new int[count];
        System.out.println("Enter " + count + " numbers :");
        for(int i = 0; i< count; i++){
            myArray[i] = scanner.nextInt();
        }
        reverse(myArray);
    }

    public static void reverse(int[] array){
        System.out.println("Reversed array = ");
        int max = array.length -1;
        int half  = array.length/2;
        for(int i = 0; i< half; i++){
            int temp = array[i];
            array[i] = array[max -i];
            array[max - i] = temp;
            }
        System.out.println(Arrays.toString(array));
    }
}
