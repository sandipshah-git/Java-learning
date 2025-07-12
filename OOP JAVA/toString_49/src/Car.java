public class Car {

    String name;
    String model;
    int year;
    String color;

    Car(String name, String model, int year, String color){
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString(){
        return color + " " + this.year + " " + name + " " + model;
    }
}
