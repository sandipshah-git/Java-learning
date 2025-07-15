import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        // ArrayList = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(9);
        list.add(5);

//        list.remove(1);
//        list.set(3,2);

//        System.out.println(list);
//        System.out.println(list.get(2));
//        System.out.println(list.size());

        Collections.sort(list); // Collections is a framwork
        System.out.println(list);

//        for(int lists : list){
//            System.out.println(lists);
//        }

    }
}

/*
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // ArrayList = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the no. of food you would like : ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter Food no. " + i + " : ");
            String Food = scanner.nextLine();
            foods.add(Food);
        }

        System.out.println(foods);


        scanner.close();

    }
}

*/


