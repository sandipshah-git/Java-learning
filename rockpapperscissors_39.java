import java.util.Random;
import java.util.Scanner;

public class rockpapperscissors_39 {
    public static void main(String[] args){
        // ROCK PAPER SCISSORS GAME
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // declaration
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        String[] choice = {"rock","paper","scissors"};

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            System.out.println("Player Choice : " + playerChoice);
    
            boolean isValid = false;
    
            for(String name : choice){
                if(playerChoice.equals(name)){
                    isValid  = true;
                    break; // it breaks loop after first match and don't again match with remaining others
                }
            }
            if(!isValid){
                System.out.println("Invalid Choice");
                continue; // Skip to next loop iteration if input is invalid
            }

            computerChoice = choice[random.nextInt(0,3)];
            System.out.print("Computer Choice : " + computerChoice + "\n\n");
            
            if(playerChoice.equals(computerChoice)){
                System.out.println("It's tie!");
            }

            else if(playerChoice.equals("rock") && computerChoice.equals("scissors") || 
               playerChoice.equals("paper") && computerChoice.equals("rock") ||
               playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("Player Won!");
            }
            else{
                System.out.println("Computer Won!");
            }
            
            // Ask to play again with input validation
            while (true) {
                System.out.print("Play again (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break; // valid input, break inner loop
                } else {
                    System.out.println("Invalid input. Please type 'yes' or 'no'.");
                }
            }

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();

    }
} 


/*import java.util.Random;
import java.util.Scanner;

public class rockpapperscissors_39 {
    public static void main(String[] args){

        // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(2,3)];
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
} */