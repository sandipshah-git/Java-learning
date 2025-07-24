public class Main {
    public static void main(String[] args){
        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

//        Box<String> box = new Box<>(); // use Integer wrapper class not only int for numbers print
//
//        box.setItem("apple");
//
//        System.out.println(box.getItem());

        Product<String , Integer> product = new Product<>("apple" , 45);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());


    }
}
