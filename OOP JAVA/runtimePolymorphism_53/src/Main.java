import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Runtime polymorphism = When the method that gets executed is decided
        //                       at runtime based on the actual type of the object.

        Animal animal ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1 = Dog) or (2 = Cat) : ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }


    }
}
