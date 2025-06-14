/*
import java.util.Scanner;

public class calculator_18 {
    public static void main(String[] args){

        // declaration
        double result=0;
        boolean validOperation = true;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator ( + , - , * , / , % , ^ ) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        switch(operator){
            case '+' ->  result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("Can't devide!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.println(result);
        }

        scanner.close();
    }
}




*/

import java.util.Scanner;

public class calculator_18 {
    public static void main(String[] args){

        // declaration
        double result=0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator ( + , - , * , / , % , ^ ) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        switch(operator){
            case '+' ->  result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("Can't devide!");
                    scanner.close();
                    return; // exit early to avoid printing wrong result
                }
                else{
                    result = num1 / num2;
                }
            }
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                scanner.close();
                return;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}




