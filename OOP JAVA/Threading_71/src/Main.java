import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Threading = Allows a program to run multiple tasks simultaneously
        //              Helps improve performance with time-consuming operations
        //             (File I/O, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
//        thread.setDaemon(true);   // this will not show time's up ->  This thread will end when Main thread finishes
        thread.start();

        System.out.println("You have 5 second to enter your name.");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}
