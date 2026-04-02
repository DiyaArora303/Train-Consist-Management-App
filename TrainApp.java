import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2: Passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Initial state
        System.out.println("Initial Bogie Count: " + passengerBogies.size());

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing AC Chair: " + passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final state
        System.out.println("Final Bogie List: " + passengerBogies);
    }
}