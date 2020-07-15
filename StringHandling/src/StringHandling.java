import java.util.Arrays;

public class StringHandling {

    public static void main(String[] args){
        String firstString = "Welcome to SSC Practical 1";
        String secondString = "Welcome";

        //String length
        System.out.println("String Length = " + firstString.length());

        //String upper and Lower cases
        System.out.println("\nString converted to uppercase : " + firstString.toUpperCase());
        System.out.println("\nString converted to lowercase : " + firstString.toLowerCase());

        //Substring
        System.out.println("\nSubstring 1 : " + firstString.substring(11));
        System.out.println("Substring 2 : " + firstString.substring(0,10));

        //Character at a particular position
        System.out.println("\nCharacter at location 6 : " + firstString.charAt(6));
        System.out.println("Character at location 10 : " + firstString.charAt(10));

        //String equality
        System.out.println("\nString 1 equals to String 2 : " + firstString.equals(secondString) + "\n");

        //String split
        String characterNames = " Nezuko, Kisaragi Saya, Naruto, Light";
        String[] splitCharacters = characterNames.split(",");
        for(String character : splitCharacters)
        System.out.println(character);
        System.out.println("\n");

        //Arrays
        int[] array1 = new int[] {1, 5,17,45,67};
        for(int element : array1)
            System.out.println(element);

        System.out.println("\n");
        int[] array2 = {1,5,17,45,67};
        int[] array3 = {3,6,7,3};

        //Array equality
        System.out.println(Arrays.equals(array1,array2));
        System.out.println(Arrays.equals(array2,array3));
        System.out.println("\n");

        //Array to string conversion
        String dest = Arrays.toString(array2);
        System.out.println(dest);

        //Array length
        System.out.println(array1.length);
    }
}
