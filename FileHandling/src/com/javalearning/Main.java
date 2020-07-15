package com.javalearning;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String line;
        FileReader fReader = null;
        BufferedReader reader = null;

        try {
            fReader = new FileReader("myFile.txt");
            reader = new BufferedReader((fReader));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(reader != null)
                    reader.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
