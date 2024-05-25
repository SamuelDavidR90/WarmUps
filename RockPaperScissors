
package RockPapersScissors;

import java.util.Random;
import java.util.Scanner;


public class SwitchConditional {


    public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        String player = "";
        String pc = "";
        
        System.out.println("Please select a number between 1 and 3: ");
        System.out.println("1 for Rock ");
        System.out.println("2 for Paper ");
        System.out.println("3 for Scissors ");
        number = keyboard.nextInt();
        int randomNumber = rand.nextInt(3);
        
        switch(number){
            case 1:
                player = "Rock";
                break;
            case 2:
                player = "Paper";
                break;
            case 3:
                player = "Scissors";
                break;
            default:
                player = "select a valid number";
                break;
        }
        
        switch(randomNumber){
            case 1:
                pc = "Rock";
                break;
            case 2:
                pc = "Paper";
                break;
            case 3:
                pc = "Scissors";
                break;
            default:
                pc = "select a valid number";
                break;
        }
        
        System.out.println("You have selected " + player);
        System.out.println("Pc has selected " + pc);
   
        if(player == pc){
            System.out.println("Tie");
        }else {
            if(player == "Rock" && pc == "Scissors" || player == "Paper" && pc == "Rock" || player == "Scissors" && pc == "Paper"){
                System.out.println("You win!!");
            } else{
                System.out.println("You lose ! ");
            }
        }
        
        
        
    }
    
}
