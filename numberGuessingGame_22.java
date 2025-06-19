import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame_22 {
    public static void main(String[] args){

        // Number guessing game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber;

        randomNumber = random.nextInt(1,6);

        System.out.println("Number Guessing Game.");
        System.out.println("Guess the number between (1-5): ");

        do{
            System.out.print("Guess the number : ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low!, guess high.");
            }
            else if(guess > randomNumber){
                System.out.println("Too high, Guess low.");
            }
            else{
                System.out.println("Correct! ");
            }
            
            

        }
        while(guess != randomNumber);

        System.out.println("Attempts : "+attempts + " times.");

        scanner.close();
    }
}