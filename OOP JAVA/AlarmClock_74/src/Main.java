import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filaPath = "src\\wav music.wav";

        while (alarmTime == null){
            try{
                System.out.print("Enter an alarm time (HH:MM:SS) : ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid Formate.");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filaPath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start(); // this executes the run method of AlarmClock class

//        scanner.close(); // sending scanner to AlarmClock class through constructor to use scanner there also just for initializing at once that is why not closing scanner here

    }
}
