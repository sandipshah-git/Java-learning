public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            if(i == 5){
                System.out.println("Time's UP.");
//                System.exit(0);
            }
        }
    }
}
