public class allInOneEnhancedForLoop {
    public static void main(String[] args) {

        String[] name = {"ram" , "shyam", "gita"};
        
        String[][] options = {
            {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
            {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
            {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
            {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
            {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };

        // enhanced for loop for 1D
        for(String nam : name){
            System.out.println(nam);
        }

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

        // enhanced for loop for 2D

        for(int i=0;i<options.length;i++){
            for(String option : options[i]){
                System.out.println(option);
            }
        }

        // for(String[] optionset : options){
        //     for(String option : optionset){
        //         System.out.println(option);
        //     }
        // }

        // int index = 0;

        // for(String[] optionset : options){
        //     // System.out.println("option set : " + optionset);
        //     for(String option : options[index]){
        //         System.out.println(option);
        //     }
        //     index++;
        // }
        
    }
}