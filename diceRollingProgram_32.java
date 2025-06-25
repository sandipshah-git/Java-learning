import java.util.Random;
import java.util.Scanner;

public class diceRollingProgram_32 {
    public static void main(String[] args){
        // java dice roll program
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int diceRoll;
        int total = 0;

        System.out.print("Enter the number of dice to roll : ");
        diceRoll = scanner.nextInt();

        if(diceRoll > 0){
            for(int i=0;i<diceRoll;i++){
                int roll = random.nextInt(1,7);
                System.out.println("you rolled " + roll);
                printDie(roll);
                total += roll;
            }
            System.out.println("Total is : " + total);

        }
        else{
            System.out.println("number of dice to roll should be more than zero.");
        }
        scanner.close();
    } 
    static void printDie(int number){
        String dice1 = """
                        ----------
                       |          |
                       |    ⬤     |
                       |          |
                        ----------
                """;
        String dice2 = """
                        ----------
                       | ⬤       |
                       |          |
                       |       ⬤ |
                        ----------
                """;        
       String dice3 = """
                        ----------
                       | ⬤       |
                       |    ⬤    |
                       |       ⬤ |
                        ----------
                """;
        String dice4 = """
                        ----------
                       | ⬤     ⬤ |
                       |          |
                       | ⬤     ⬤ |
                        ----------
                """;
        String dice5 = """
                        ----------
                       | ⬤    ⬤  |
                       |    ⬤     |
                       | ⬤    ⬤  |
                        ----------
                """; 
        String dice6 = """
                        ----------
                       | ⬤    ⬤  |
                       | ⬤    ⬤  |
                       | ⬤    ⬤  |
                        ----------
                """;         

        switch(number){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }        
    }                         
}
