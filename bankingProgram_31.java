import java.util.Scanner;

public class bankingProgram_31 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int choice ;
        double amount = 0;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("***********************");
            System.out.println("Banking Program");
            System.out.println("***********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice (1-4) : ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(amount);
                case 2 -> {
                    amount += Deposite();
                    System.out.println("Balance after deposited is " + amount);
                }
                case 3 -> {
                    double withdrawn = Withdraw(amount); // making this variable to stop, 2 tymes calling same
                    amount -= withdrawn;
                    System.out.println("You successfully withdraw : " + withdrawn);
                    System.out.println("Balance after withdraw is " + amount);
                }
                case 4 -> {
                    System.out.println("Thank you!, all the best.");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Choice");
            }

        }

        scanner.close(); 

    }
    static void showBalance (double amount){
        System.out.println("The balance is : " + amount + "\n");  
    }
    static double Deposite (){
        System.out.print("Enter amount to be deposite : ");
        double depositeAmount = scanner.nextDouble();

        if(depositeAmount < 0){
            System.out.println("Can't be negative amount.");
            return 0; // don't forget to return if method is return type
        }
        else{
            return depositeAmount;
        }
    }
    static double Withdraw(double amount){
        System.out.print("Enter amount to be withdraw : ");
        double withdraAmount = scanner.nextDouble();

        if(withdraAmount < 0){
            System.out.println("Can't be negative amount.");
            return 0;
        }
        else if (withdraAmount > amount){
            System.out.println("Insufficient amount.");
            return 0;
        }
        else{
            return withdraAmount;
        }
    }
}
