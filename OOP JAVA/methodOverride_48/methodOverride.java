public class methodOverride {
    public static void main(String[] args) {
        
        // Method overriding = When a subclass provides its own
        //                                      implementation of a method that is already defined.
        //                                      Allows for code reusability and gives specific implementations.
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat  = new Cat();
        Fish fish = new Fish();

        animal.move();
        dog.move();
        cat.move();
        fish.move();
    }
}
