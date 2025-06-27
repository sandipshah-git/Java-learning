public class elementSerchInArray_35 {
    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "banana", "mango"};
        String target = "orange";
        boolean isFound = false;

        for(int i=0;i<fruits.length;i++){
            if(target.equals(fruits[i])){ // fruits[i].equals(target)  also can use
                //target == fruits[i] -> it's value type not refference so not use
                System.out.println("\nElement found at index : " + i);
                isFound = true;
                break; // it stops after first match and don't print 2 locations of 6 element. i.e 2 tymes in array
            }
        }
        if(!isFound){ // isFound == false;   can also use
            System.out.println("\nElement not found in the array.");
        }
    }
}





/*public class elementSerchInArray_35 {
    public static void main(String[] args){

        int[] numbers = {2, 6, 7, 4, 6, 9, 0};
        int target = 5;
        boolean isFound = false;

        for(int i=0;i<numbers.length;i++){
            if(target == numbers[i]){
                System.out.println("\nElement found at index : " + i);
                isFound = true;
                break; // it stops after first match and don't print 2 locations of 6 element. i.e 2 tymes in array
            }
        }
        if(!isFound){ // isFound == false;   can also use
            System.out.println("Element not found in the array.");
        }
    }
}
 */