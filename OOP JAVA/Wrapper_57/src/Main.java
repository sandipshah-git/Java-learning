public class Main {
    public static void main(String[] args){
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static utility methods.


        // Autoboxing
//        Integer a = 4; // this is like -> Integer a = new Integer(34);  but not in use
//        Character b = '$';
//        Double c = 4.6;

        // Unboxing
//        int x = a;
//        char y = b;
//        double z = c;

//        System.out.println(z);


        // Now for concatinate of Strings (primitive data type to String data type)

//        String a = Integer.toString(124);
//        String b = Double.toString(34.22);
//        String c = Character.toString('@');
//        String d = Boolean.toString(true);
//
//        String x =  a+b+c+d;
//
//        System.out.println(x);


        // Now for String data type to primitive data type

//        int a = Integer.parseInt("1234");
//        double b = Double.parseDouble("34.32");
//        char c = "Pizza".charAt(0); // character doesn't have parse method ,and it is also unrelated to wrapper class
//        boolean d = Boolean.parseBoolean("true");
//
//        System.out.println(a); // it will give 1234
//
//        String x = a+b+c+d;
//
//        System.out.println(x); // it will not run cause that is different data type, not like as only String type


        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
