import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        // or u can directly use below object by initialize for fresh code or readable
//        String fileName = "C:\\Users\\Sandip Shah\\Desktop\\test.txt";
//        String textContent = "hello duniya, mai aa raha raj karne";

        try(FileWriter writer = new FileWriter("C:\\Users\\Sandip Shah\\Desktop\\test.txt")){ // or simply u can only write test.txt
            writer.write("hello duniya, mai aa raha raj karne.");
            System.out.println("File has been written.");
        }

        catch (FileNotFoundException e){
            System.out.println("could not locate file location");
        }

        catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
