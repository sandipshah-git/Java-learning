import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args){
        // declaration 
        double weight , newWeight;
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("Weight converter program.");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if(option == 1){
            System.out.print("Enter the weight in lbs : ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.205;
            System.out.printf("The new weight in kg is : %.2f", newWeight);
        }
        else if(option == 2){
            System.out.print("Enter the weight in kgs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.205;
            System.out.printf("The new weight in lbs is : %.2f", newWeight);
        }
        else{
            System.out.println("That was not a valid choise.");
        }

        scanner.close();

    }
}
