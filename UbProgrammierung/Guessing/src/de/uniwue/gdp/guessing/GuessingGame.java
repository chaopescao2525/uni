package de.uniwue.gdp.guessing;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[]args){

        System.out.println("Welcome!");

        Random randomnum = new Random();

        Scanner input = new Scanner(System.in);

        String play = "y";

        while(play.equals("y")){
            int num = randomnum.nextInt(1000)+1;
            int zahl;

        while(true){

            System.out.println("Please enter your guess: ");

            try{
                zahl = input.nextInt();

                if(zahl>num){
                    System.out.println("Too big!");
                }else if(zahl<num){
                    System.out.println("Too small!");
                }else{
                    System.out.println("You win!");
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Not a number - Try again");
                input.next();
            }
        }

        System.out.println("Play another round? [y/N]");
        play = input.next();

        }
    }
}
