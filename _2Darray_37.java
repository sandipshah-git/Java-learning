public class _2Darray_37 {
    public static void main(String[] args){
        // 2D array = An array where each element is an array
        //                    Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana", "mango"};
        String[] meats = {"chicken", "muton", "pork", "beef"};
        String[] vegetables = {"potato", "onion", "carrot"};

        // String[][] groceries = {{"apple", "orange", "banana", "mango"},{"chicken", "muton", "pork", "beef"},
        //                                        {"potato", "onion", "carrot"}};

        String[][] groceries = {fruits,meats,vegetables};
        groceries[1][3] = "egg"; // replacing beef

        System.out.println();

        for(String[] names : groceries){
            for(String name : names){
                System.out.print(name + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}

/*
// another example
public class _2Darray_37 {
    public static void main(String[] args){
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}
        };
    
        for(char[] datas : telephone){
        for(char data : datas){
            System.out.print(data + "  ");
        }
        System.out.println();
    }
    
    }
}
 */