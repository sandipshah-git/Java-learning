import java.util.Random;

public class coinFlip {
    public static void main(String[] args){
        
        Random random = new Random();

        boolean isHead;
        isHead = random.nextBoolean();

        // System.out.println(isHead);

        if(isHead){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }


    }
}
