import java.util.Scanner;

public class averageOf3Numbers_28 {
    public static void main(String[] args){
        // finding average of three numbers 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value : ");
        int a = scanner.nextInt();
        System.out.print("Enter b value : ");
        int b = scanner.nextInt();
        System.out.print("Enter c value : ");
        int c = scanner.nextInt();

        System.out.println(average(a,b,c));

        scanner.close();

    }
    static double average(int a,int b, int c){
        double averageResult = (a+b+c)/3.0;
        return averageResult;
        
    }
}
