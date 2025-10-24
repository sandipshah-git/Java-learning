import java.util.Scanner;

public class QuizeGame {
    public static void main(String[] args) {
        // Quize Game 

        Scanner scanner = new Scanner(System.in);

        String[] questions = {"What is the main function of a router?",
                            "Which part of the computer is considered the brain?",
                            "What year was Facebook launched?",
                            "Who is known as the father of computers?",
                            "What was the first programming language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                            {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                            {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                            {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                            {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int count = 0;
        int [] answer = {3, 1 , 2, 4, 3};

        for(int i = 0; i < questions.length; i++){
            System.out.println("Q" + (i + 1) + " " + questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Guess the answer : ");
            int guess  = scanner.nextInt();

            if(guess == answer[i]){
                System.out.println("**********");
                System.out.println("Correct");
                System.out.println("**********");
                count++;
            }
            else{
                 System.out.println("**********");
                System.out.println("Wrong");
                System.out.println("**********");
            }
        }

        System.out.println("The total score is : " + count + " out of " + questions.length);

        scanner.close();




    }
}