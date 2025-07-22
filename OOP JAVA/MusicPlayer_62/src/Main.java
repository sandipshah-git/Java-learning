import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        // music player
        // How to PLAY AUDIO with Java (.wav , .au , .aiff)

        String filePath = "src\\wav music.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            // AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            // --> once u open audioStream object then it should also need to close using finally class so if u put this lines of code in try() then u don't need to close with finally class

//            Scanner scanner = new Scanner(System.in); --> if don't want to close scanner in finally class then put this in try() --> that do automatic close with modern java
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
//            System.out.println("No problem detected.");
//            clip.start();
            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quite");
                System.out.print("Enter your choice : ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice.");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");;
        }
        catch (LineUnavailableException e){
            System.out.println("unable to access audio resource.");
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
