//Number Game Systems
package com.NumberGame;

import java.util.Scanner;
public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        int chances = 8;
        int finals = 0;
        boolean playAgain = true;

        System.out.println("\n*********************************************");
        System.out.println("*\t  Welcome to the Number Game System   \t*");
        System.out.println("*********************************************\n");

        System.out.println("This is Guessing Number System Game! \n");
        System.out.println("* Choose any number from 1 to 100");
        System.out.println("* Here, You have "+ chances+ " chances to win the game " );


        while(playAgain){

            int random = getrandN();
            boolean guess = false;

            System.out.println("\n-----------GAME START------------");
            System.out.println("\n* Enter your any Guess Number ->");
            for(int i = 0; i< chances; i++){

                System.out.println("\n Chance " + (i+1) + " :");
                int user = sc.nextInt();

                if(user == random){
                    guess = true;
                    finals = finals + 1;
                    System.out.println("\n CONGRATS! You win the Game..");
                    break;
                }
                else if (user > random ) {
                    System.out.println("You Guessed Too High number");
                }
                else if (user < random ) {
                    System.out.println("You Guessed Too Low number");
                }
            }
            if(guess = false){
                System.out.println("\n Sorry! You lost the Game");
            }

            System.out.println("\n Do you want to Play Again? (y/n) ");
            String ans = sc.next();

            playAgain = ans.equalsIgnoreCase("y");

        }
//        System.out.println("\n Hope you liked the Game..");
        System.out.println("\n* Hope you liked the Game..");
        System.out.println("\n-------------------");
        System.out.println("|\tSCORE is:  "+finals +"  |");
        System.out.println("-------------------");

        System.out.println("\n THANKYOU! \n");
    }

    private static int getrandN() {
        return(int) (Math.random()*(100)+1);

    }


}
