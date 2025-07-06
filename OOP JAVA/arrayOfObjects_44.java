public class arrayOfObjects_44 {
    public static void main(String[] args) {

        Car_44 car1 = new Car_44 ("sandip " , "black");
        Car_44 car2 = new Car_44 ("syand " , "white");
        Car_44 car3 = new Car_44 ("janna " , "red");

        Car_44[] cars = new Car_44 [3];

        cars [0] = car1;
        cars [1] = car2;
        cars [2] = car3;

        // Car_44 [] cars = {car1, car2, car3};

        // Car_44 [] cars = {new Car_44("Mustang", "Red"),
        //                     new Car_44("Corvette", "Blue"),
        //                     new Car_44("Charger", "Yellow")
        // };

       
        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }

        for(Car_44 car : cars){
            car.color = "black";
        }

        for(Car_44 car : cars){
            car.drive();
        }
    }
}

