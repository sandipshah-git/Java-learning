import java.util.Random;
import java.util.Scanner;

public class slotMachine_40 {
    public static void main(String[] args){
        // Java Slot Mechine
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println(" Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("*************************");

        int balance = 100;
        int bet;
        
        System.out.println("The balance is : Rs.100");

        while(balance > 0){
            System.out.print("Place your bet amount  : ");
            bet  = scanner.nextInt();
            scanner.nextLine();

            if(bet <= 0){
            System.out.println("Bet must be greater than 0");
            System.out.println("The new balance is : Rs." + balance);
            continue;  
            }
            else if(bet > balance){
                System.out.println("Insufficient Balance.");
                System.out.println("The new balance is : Rs." + balance);
                continue;
            }
            else{
                balance -= bet;
            }

            String[] print = spinRow();
            printRow(print);
            int result = getPayout(print , bet);

            if(result > 0){
                System.out.println("       You won! ");
                System.out.println("Now your winning bet amount is " + result);
                balance += result;
                System.out.println("The new balance is : Rs." + balance);
            }
            else{
                System.out.println("yup! You lose.");
                System.out.println("The new balance is : Rs." + balance);
            }

            System.out.print("PlayAgain (y/n) : ");
            char playAgain = scanner.next().toUpperCase().charAt(0);
            
            if(playAgain == 'Y'){
                continue;
            }
            else{
                System.out.println("Thank you!");
                break;
            }
        }

        scanner.close();
    }
    static String[] spinRow(){
        System.out.println("Spinning....");
        String[] symbols = {"🍒" ,"🍉", "🍋" ,"🔔" ,"⭐"};
        Random random = new Random();
        String[] row = new String[3];
        for(int i=0;i<3;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("****************");
        System.out.println(" " + String.join(" | ", row ));
        System.out.println("****************");
    }
    static int getPayout(String[] row , int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 6;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 2;
                case "🔔" -> bet * 8;
                case "⭐" -> bet * 4;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 5;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 3;
                case "🔔" -> bet * 2;
                case "⭐" -> bet * 6;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 4;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 4;
                case "⭐" -> bet * 3;
                default -> 0;
            };
        }
        return 0;
    }
}