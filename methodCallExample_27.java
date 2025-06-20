public class methodCallExample_27 {
    public static void main(String[] args){

        // double number = methodCall(3);
        // System.out.println(number);

        // System.out.println(callMethod("ram " , "shyam"));

        int age = 2 ;
        boolean Age = validation(age);

        if(Age){
            System.out.println("eligible");
        }
        else
        System.out.println("not elligible");



    }
    // static double methodCall (double number){
    // return number * number;
    // }

    // static String callMethod(String first, String second){
    //     return first + second;
    // }

    static boolean validation(int age){
        if (age >= 18) {
            return true ;  // instead of if & else can write :     return age >= 18;
        }
        else
        return false;
    }

}
