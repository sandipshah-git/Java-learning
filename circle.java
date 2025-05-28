import java.util.Scanner;

public class circle {
    public static void main(String[] args){
        // circumference of circle (c) = 2.PI.r
        // area of circle (a) = PI.r²
        //volume of circle (v) = (4/3).PI.r³

        // declaration
        double c;
        double r;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius value (r) : ");
        r = scanner.nextDouble();

        c = 2*Math.PI*r;

        // System.out.println("Circumference of a circle is " + c + " cm²");
        System.out.printf("Circumference of a circle is %.2f cm²" , c);


        scanner.close();
         

    }
}
