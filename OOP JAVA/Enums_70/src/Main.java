import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Enums = (Enumerations) A special kind of class that
        //          represents a fixed set of constants.
        //          They improve code readability and reliability(easy to maintain).
        //          More efficient with switches rather than comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week : ");
        String response = scanner.nextLine().toUpperCase();

        try{
            //        Day day = Day.SATURDAY;

            Day day = Day.valueOf(response);

//        System.out.println(day);
//        System.out.println(day.getDayNumber());

            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY-> System.out.println("this is a weekday.");
                case SATURDAY, SUNDAY -> System.out.println("this is a weekend.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day.");
        }

        scanner.close();

    }
}
