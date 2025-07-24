import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> hashMap = new HashMap<>();

        hashMap.put("apple", 4.5);
        hashMap.put("orange", 34.4);
        hashMap.put("banana", 48.2);
        hashMap.put("coconut", 23.9);

//        hashMap.put("orange",100000.00);

//        hashMap.remove("apple");

//        System.out.println(hashMap);
//
//        System.out.println(hashMap.get("apple"));
//
//        System.out.println(hashMap.containsKey("coconut"));
//
//        System.out.println(hashMap.containsValue(48.2));
//
//
//        if(hashMap.containsKey("apple")){
//            System.out.println(hashMap.get("apple"));
//        }
//        else {
//            System.out.println("Key not found!");
//        }
//
//        System.out.println(hashMap.size());

        for(String key : hashMap.keySet()){
            System.out.println(key + " : $" + hashMap.get(key));
        }



    }
}
