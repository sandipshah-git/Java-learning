import java.util.Scanner;

public class whileConditionGame_21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing game.");
            System.out.print("Press Q to quite : ");
            response = scanner.next().toUpperCase();
        }

        // do{
        //     System.out.println("You are playing game.");
        //     System.out.print("Press Q to quite : ");
        //     response = scanner.next().toUpperCase();
        // }
        // while(!response.equals("Q"));

        System.out.println("You have quite the game.");

        scanner.close();
    }
}
