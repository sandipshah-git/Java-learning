import java.util.Scanner;
public class logicalOperator {

    public static void main(String[] args){
        // logical operator
        // || = OR
        // && = AND
        // ! = NOT

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the username (4-12 characters) : ");
        String username = scanner.nextLine();

        if(username.length() <= 4 || username.length() >= 12 ){
            System.out.println("Enter the username between 4 to 12 character.");
            
            if(username.contains(" ") || username.contains("_")){
                System.out.println("Username and space is not allowed.");
            }
            else{
            scanner.close();
            return;
            }
        }
        else{
            System.out.println(username);
        }
        

        scanner.close();
    }
}
