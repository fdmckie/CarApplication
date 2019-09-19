
import java.util.ArrayList;

public class CarApp {
    public static void main(String[] args) {

        Car c = new Car();

        c.setMake("ForD");
        c.setModel("Mustang");
        c.setYear(1984);


        Engine e = new Engine();
        c.setEngine(e);

        Door door = new Door();
        ArrayList<Door> doors = new ArrayList<>();
        doors.add(door);

        // lock the car by calling the car's lock method
        c.lock(true);

        // method chaining allows you to 'drill down' objects and
        // methods. Here we are passing a new unnamed door to the
        // add method of the cars getDoor method.
        c.getDoors().add(new Door());

        // another example of method chaining. The car's
        // getMake method returns a string which you can
        // call the built-in string methods.
        System.out.println(c.getMake().toLowerCase() + " " + c.getModel().toUpperCase() + " " + c.getYear());
    }
}
