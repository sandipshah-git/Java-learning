public class variableScope_30 {
    static int x = 5; // class variable
    /* static int x = 5;   A static method can only access other 
     static members (variables or methods) directly. that's why it should also be static  */
    public static void main(String[] args){                
        // variable scope = where a variable can be accessed
        //  its   local or class     variable

        // int x = 2; // local variable
        System.out.println("i'm main " + x);
        doSomething();
    }
    static void doSomething(){
        int x = 4;  // local variable

        System.out.println("i'm new : " + x);
    }
}

/*
Solution if you remove static:
You must create an object of the class to access it:

int x = 5;

public static void main(String[] args) {
    variableScope_30   obj = new variableScope_30();
    System.out.println(obj.x); // works now
}

 */