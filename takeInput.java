import java.util.Scanner;
public class takeInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = scanner.nextLine();

        System.out.print("The age is : ");
        int age = scanner.nextInt();

        System.out.print("Enter the value of pI is : ");
        double pi = scanner.nextDouble();

        System.out.print("Are you a student ?(true or false) : ");
        boolean isStudent = scanner.nextBoolean();
        
        System.out.println("\nThe name is "+ name);
        System.out.println("The age of " + name + " is " + age);

        if(isStudent){
            System.out.println("you are enrolled as a student.");
        }
        else{
            System.out.println("you are not enrolled as a student");
        }
        System.out.println("The pi value is " + pi);

        scanner.close();
    }
}
