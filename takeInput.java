import java.util.Scanner;
public class takeInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = scanner.nextLine();

        System.out.print("The age is : ");
        int age = scanner.nextInt();
        
        System.out.println("\nThe name is "+ name);
        System.out.println("The age of " + name + " is " + age);

        scanner.close();
    }
}
