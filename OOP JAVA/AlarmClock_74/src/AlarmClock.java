import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner){
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
//        LocalTime now = LocalTime.now(); // u also can use now object instead of LocalTime.now() in while loop

        while (LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

//                int hours =  now.getHour();
//                int minuts =  now.getMinute();
//                int seconds =  now.getSecond(); // removing hors,min,sec by direct writing this at sout below

//                System.out.println(hours + ":" + minuts + ":" + seconds);
                System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond()); // removing \n from back and adding \r at front

//                System.out.println(LocalTime.now()); // if not using hours,minus,second in int then use it
            }
            catch (InterruptedException e) {
                System.out.println("Thread was Interrupted.");
            }
        }

        System.out.println("\nAlarm noises.");
//        Toolkit.getDefaultToolkit().beep(); // Toolkit is a class of java for make a beep sound
        playSound(filePath);

    }
    private void playSound(String filePath){

        File audioFile = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press *Enter* to stop the alarm : ");
            scanner.nextLine();
            clip.stop();

            scanner.close();

//            Thread.sleep(10000); // use it only if not allow user to stop alarm (so it automatically close after the time that is set.)
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file formate is not supported.");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio is unavailable.");
        }
        catch (IOException e) {
            System.out.println("Error reading audio file.");
        }

    }
}
