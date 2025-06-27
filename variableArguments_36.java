public class variableArguments_36 {
    public static void main(String[] args){
        // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)

        System.out.println("\nThe average is " + add(3,5,6,9,7));
    }
    static double add(double... numbers){
        double sum = 0;
        for(double num : numbers){
            sum += num;
        }

        if(numbers.length == 0){
            return 0;
        }
        return sum/numbers.length;

        
    }

}


/*public class variableArguments_36 {
    public static void main(String[] args){
        // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)

        add(3,5,6,9,7);
    }
    static void add(int... numbers){
        double sum = 0;
        for(int num : numbers){
            sum += num;
            
        }
        
        double average = sum/numbers.length;

        System.out.println("\nThe sum of numbers : " + sum);

        if(numbers.length == 0){
            System.out.println("can't divide with zero.");
        }
        else{
            System.out.println("The Average of numbers is : " + average);
        }
        
    }

} */