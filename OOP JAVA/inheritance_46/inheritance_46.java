public class inheritance_46 {
    public static  void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                  child      <-       parent      <-       Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();

        dog.eat();
        cat.eat();
        animal.eat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(animal.isAlive);

        plant pt = new plant();
        pt.photosynthesize();
        System.out.println("plant is alive : " + pt.isAlive);

        System.out.println("The dog lives " + dog.lives);
        dog.speaks();
        System.out.println("The cat lives " + cat.lives);
        cat.speaks();
    }
}
