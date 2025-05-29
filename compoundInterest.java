import java.util.Scanner;

public class compoundInterest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //declaration
        double A , p , t, r,n;

        System.out.print("Enter the initial principal balanace (p) : ");
        p = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %) (r) = ");
        r = scanner.nextDouble()/100;
        System.out.print("Enter the number of times interet applied per time period (n) : ");
        n = scanner.nextDouble();
        System.out.print("Enter the number of time period elapsed (t) : ");
        t = scanner.nextDouble();

        A = p * Math.pow(1+r/n, n*t);

        System.out.printf("The Final Amount is Rs.%.2f ", A);

        scanner.close();
    }
}