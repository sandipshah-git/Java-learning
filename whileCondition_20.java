import java.util.Scanner;

public class whileCondition_20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //declaration
        String name = "";

        while(name.isEmpty()){ // if is not work instead of while
            System.out.print("Enter your name : ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // below code works for infinite loop

        // while(1 == 1){
        //     System.out.println("Help!, i'm stuck in a loop");
        // }

        scanner.close();
    }
}
