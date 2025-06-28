 import java.util.Scanner;

public class searchTargetWordInString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // declaration
        String playerChoice;
        boolean isRunning = false;


        String[] choice = {"rock","paper","scissors"};

        while(!isRunning){
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            boolean isValid = false;
    
            for(String name : choice){
                if(playerChoice.equals(name)){
                    isValid  = true;
                    break; // it breaks loop after first match and don't again match with remaining others
                }
            }
            if(isValid){
                System.out.println("contains");
            }
            else{
                System.out.println("Invalid");
            }
        }

        
        scanner.close();

    }
}