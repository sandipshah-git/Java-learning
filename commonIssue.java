import java.util.Scanner;

public class commonIssue {
    public static void main(String[] args){
        // common issue  (it comes due to when u write integer user's input at first rather that string)
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favourite color : ");
        String color = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite language : ");
        String language = scanner.nextLine();

        System.out.println("\nYour age is " + age + " year old.");
        System.out.println("Your favourite color is " + color + ".");
        System.out.println("Your favourite language is " + language + ".");
        scanner.close();
    } 
}
