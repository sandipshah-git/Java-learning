public class switchCase_17 {
    public static void main(String[] args){
        // Enhance switch = A replacement to many else if statements

        String day = "Sunday";

        switch(day){
            case "Sanday" -> System.out.println("It is a weekday");
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thrusday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            default -> System.out.println("It is not a weekday.");
        }

        // switch(day){
        //     case "Monday" , "Tuesday", "Wednesday", "Thrusday", "Friday" ->
        //     System.out.println("It is a weekday");
        //     case "Saturday", "Sunday" -> System.out.println("It is a weekend");
        //     default -> System.out.println("It is not a weekday.");
        // }



        // belows code won't work

        // switch(day){
        //     case 1:
        //     System.out.println("It is a weekday");
        //     break;
        //     case 2:
        //     System.out.println("It is a weekday");
        //     break;
        //     default:
        //     System.out.println("It is not a weekday");
        // }
    }
}
