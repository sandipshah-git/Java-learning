import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //              try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);
        // if u write scanner instance in try() then u don't need to close scanner in finally class

//        try{
//            System.out.println(4 / 0);
//        }
//        // ArithmeticException
//        catch (ArithmeticException e){
//            System.out.println("you can't divide by zero.");
//        }

        try{
            System.out.print("Enter a number : ");
            int num = scanner.nextInt();
            System.out.println(num);
        }
//        InputMismatchException -> it should also be imported
//        catch (InputMismatchException e){
//            System.out.println("that wasn't a number.");
//        }

        // it is work in all exeptions
        catch (Exception e) {
            // SAFETY NET
            System.out.println("Something went wrong.");
        }

        finally {  // it is optional (it's used for something you forger for do) eg. like close the scanner
            scanner.close();
            System.out.println("\nthis always executes.");
        }
    }
}
