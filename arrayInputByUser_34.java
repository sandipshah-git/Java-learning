import java.util.Scanner;

public class arrayInputByUser_34 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names you want: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // ✅  Consume the newline character left by nextInt()
        // this issue comes due to taking interger input first rather than string 
        // (if there is string then they have nextLine(), so that makes already to newline)

        // nextLine() -> Read a whole line of text from the user (until they press Enter).
        // but nextInt() -> This may read leftover Enter key (not real input)
        // ✅ "Leftover" means: something that's still there and not used yet.

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nNames you entered:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}  /*When we use nextInt() or nextDouble(), they only read the number but don’t consume the Enter key (\n) 
that the user presses after typing.
So, if we call nextLine() right after that, it will just read that leftover newline without waiting 
for real input.
To fix this, we add one scanner.nextLine() to consume the leftover newline, so that 
the next actual nextLine() works properly. 
✅ "Leftover" means: something that's still there and not used yet.
*/

