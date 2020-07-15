package com.javalearning;

public class Main {

    public static void main(String[] args) {

            int position = calculateHighScorePosition(1500);
            displayHighScorePosition("Sayali", position);

            position = calculateHighScorePosition(900);
            displayHighScorePosition("Sanchita", position);

            position = calculateHighScorePosition(400);
            displayHighScorePosition("Roshni", position);

            position = calculateHighScorePosition(50);
            displayHighScorePosition("Kanishk", position);
    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore >= 1000){
//            return 1;
//        }else if(playerScore >= 500){
//            return 2;
//        }else if(playerScore >= 100){
//            return 3;
//        }
//        return 4;
//          OR
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position =3;
        }
        return position;
    }
}
