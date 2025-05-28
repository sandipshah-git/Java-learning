public class printf {
    public static void main(String[] args){
        // prinf --> is a method used to format output

        // % [flags] [width] [.precision] [specifier-character]

        // here for  [specifier-character]

        String name = "sandip shah";
        char firstLatter = 'A';
        int age = 23;
        double height = 5.11;
        boolean isStudent = true;

        System.out.printf("Hello %s \n" , name);
        System.out.printf("your name start with %c \n" , firstLatter);
        System.out.printf("your age is %d \n", age);
        System.out.printf("Your height is %f \n" , height);
        System.out.printf("Sandip shas is a student --> %b \n", isStudent);

        // combined
        System.out.printf("%s is %d year old\n\n\n" , name , age);

        // here for [.precision]

        float price = 35.67890f;
        long priceSecond = 33236556L;
        double thirdPrize = 123.324;

        System.out.printf("The price is : %.2f \n", price);
        System.out.printf("the third prize is %.2f \n", thirdPrize);
        System.out.printf("The second price value is %d \n\n", priceSecond);

        // here for [flags]

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        
        double price1 = 900495.99;
        double price2 = 340490.435;
        double price3 = -113546.43;

        System.out.printf("%+f\n", price1);
        System.out.printf("%+f\n", price2);
        System.out.printf("%+f\n\n\n", price3);

        System.out.printf("%,f\n", price1);
        System.out.printf("%,f\n", price2);
        System.out.printf("%,f\n\n", price3);

        System.out.printf("%(f\n", price1);
        System.out.printf("%(f\n", price2);
        System.out.printf("%(f\n\n", price3);

        System.out.printf("% f\n", price1);
        System.out.printf("% f\n", price2);
        System.out.printf("% f\n\n", price3);

        // here for width

        // 0 = zero padding (put like how much zero ex. 04 --> 0000)
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 12;
        int id3 = 345;
        int id4 = 6789;

        System.out.printf("%04d\n" ,id1);
        System.out.printf("%04d\n" ,id2);
        System.out.printf("%04d\n" ,id3);
        System.out.printf("%04d\n\n" ,id4);

        System.out.printf("%4d\n" ,id1);
        System.out.printf("%4d\n" ,id2);
        System.out.printf("%4d\n" ,id3);
        System.out.printf("%4d\n\n" ,id4);

        System.out.printf("%-4d\n" ,id1);
        System.out.printf("%-4d\n" ,id2);
        System.out.printf("%-4d\n" ,id3);
        System.out.printf("%-4d\n\n" ,id4);
    }
}
