import java.util.Scanner;

public class temperatureByTernary_16 {
    public static void main (String[] args){
        // °F = (°C * 9/5) + 32 
        // °C = (°F - 32) * 5/9 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        double temp = scanner.nextDouble();
        
        System.out.print("Convert to Celsius or Fahrenheit ? (C or F ) : ");
        String symbol = scanner.next().toUpperCase();

        double newTemp = (symbol.equals("C")) ? (temp - 32) * 5/9  : (temp * 9/5) + 32 ;

        System.out.printf("%.2f°%s",newTemp,symbol);
        
        scanner.close();


    }
}
