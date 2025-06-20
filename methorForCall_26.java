public class methorForCall_26 {
    public static void main(String[] args){
        // method = a block of reusable code that is executed when called ()

        int age = 20;
        String name = "sandip";

        birthdayWish(age,name);

    }
    static void birthdayWish (int Age, String Name){// we should make it static cause above function is static
        System.out.println("Happy Bithday to you! ");
        System.out.println("Happy Bithday dear " + Name);
        System.out.printf("You are %d year old.", Age);
        System.out.println("\nHappy Birthday to you.");
    }
}
