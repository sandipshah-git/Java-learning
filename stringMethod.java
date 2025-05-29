public class stringMethod {

    public static void main(String[] args){

        String name = "Password";
        // String name = "   Bro code ";

        // int length = name.length();
        // char letter = name.charAt(4);
        // int index = name.indexOf("d");
        // int index = name.lastIndexOf("o");
        // String uppercase = name.toUpperCase();
        // String lowercase = name.toLowerCase();
        // String trim = name.trim();
        // String replace = name.replace("o", "a");
        // boolean isImpty = name.isEmpty();

        // if(name.contains(" ")){
        //     System.out.println("your name contain space.");
        // }
        // else{
        //     System.out.println("your name not containing any space.");
        // }


        // if(name.equals("password")){
        //     System.out.println("matched");
        // }
        // else{
        //     System.out.println("not matched");
        // }

        if(name.equalsIgnoreCase("password")){
            System.out.println("matched");
        }
        else{
            System.out.println("not matched");
        }


        // System.out.println(isImpty);


    }
}