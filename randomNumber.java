import java.util.Random;

public class randomNumber {
    public static void main(String[] args){
        Random random = new Random();

        // int x = random.nextInt();
        int x = random.nextInt(1,6); // it gives  1,2,3,4,5 

        System.out.println(x);

    }
}
