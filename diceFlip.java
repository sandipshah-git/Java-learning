import java.util.Random;

public class diceFlip {
    public static void main(String[] args){
        Random random = new Random();
        
        int dice1;
        int dice2;
        int dice3;

        dice1 = random.nextInt(1,7);
        dice2 = random.nextInt(1,7);
        dice3 = random.nextInt(1,7);
        

        System.out.println("first dice : " + dice1);
        System.out.println("second dice : " + dice2);
        System.out.println("third dice : " + dice3);
    }
}
