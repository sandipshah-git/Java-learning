import java.util.Scanner;

public class hypotenuseCalculate {
    public static void main(String[] args){
        // to calculate Hypotenuse (h) =  sqrt(p² + b²)
        
        //declaration
        int p , b;
        double h;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base value (b) : ");
        b = scanner.nextInt();

        System.out.print("Enter the perpendicular value (p) : ");
        p = scanner.nextInt();

        h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));
        
        System.out.println("The Hypotenuse value is (h) = " + h + " cm²");


        scanner.close();


    }
}