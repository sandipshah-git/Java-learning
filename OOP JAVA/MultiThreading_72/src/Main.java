public class Main {
    public static void main(String[] args){
        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations


//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
        // or for shortcut
//        Thread thread = new Thread(new MyRunnable());
//        thread.start();

        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();

    }
}
