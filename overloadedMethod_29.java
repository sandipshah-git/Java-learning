public class overloadedMethod_29 {
    public static void main(String[] args){
        String a = "Sandip";
        String b = " Sah";
        String c = " Teli";
        String resultingName = name(a,b,c);
        System.out.println(resultingName);

    }
    static String name(String name1, String name2){
        return name1 + name2;
    }
    static String name(String name1, String name2, String name3){
        return name1 + name2 + name3;
    }
}




/*
public class overloadedMethod_29 {

    public static void main(String[] args) {
    // Calling same method with same name but different signature.
    //                      signature = name + parameters

    add(10,20,30); // prints The sum is 60
    add(10,30);  // prints the sum is 40
    }

    // in below method there should be same name but not same parameter(i.e 2 int & 2 int) 
                                                   // otherwise it can't work
    static void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
    }

    static void add(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        System.out.println("The sum is "+sum);
    }
}
*/


/*
// in below method there should be same name but not same parameter(i.e 2 int & 2 int) 
                                                   // otherwise it can't work

public class overloadedMethod_29 {
    public static void main(String[] args){

        int result = add(3,5);
        System.out.println(result);
    }
    static int add (int a, int b){
        return a + b;
    }
    static int add(int a, int b){
        return a + b;
    }
}

*/
