//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Polymorphism is a greek word for poly-"many", morph-"form"
        // The ability of an object to identify as more than one type.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

       Vehicles[] racers = {car, bicycle, boat};
       // Since Vehicles is the parent class of the objects, we can set the data type of
        // racers array to Vehicles
//        car.go();
//        boat.go();
//        bicycle.go();
        for(Vehicles vehicle : racers) {
            vehicle.go();
        }

    }
}