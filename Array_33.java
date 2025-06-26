// import java.util.Arrays;

public class Array_33 {
    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "banana", "mango"};
        
        // fruits [1] = "sweet";
        // System.out.println(fruits[1]);

        // for(int i=0;i<fruits.length;i++){
        //     String fruitsName = fruits[i];
        //     System.out.print(fruitsName + " ");
        // }

        // Arrays.sort(fruits);
        // Arrays.fill(fruits, "pineapple");
        
        // enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
