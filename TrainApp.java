import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.LinkedHashSet;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC1 & UC2: Basic Initialization and ArrayList Operations
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        passengerBogies.remove("AC Chair");
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Passenger Bogies: " + passengerBogies);
        System.out.println("Does Sleeper exist? " + exists);

        // UC3: Unique Bogie ID Tracking (HashSet)
        // Ensures no two bogies have the same identification number
        Set<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate - will be ignored by HashSet

        System.out.println("Unique Bogie IDs: " + bogieIDs);

        // UC4: Real-time Consist Reordering (LinkedList)
        // Perfect for adding a Pantry car in the middle of a train
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2, "Pantry"); // Insert at specific position

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Ordered Train Consist: " + trainConsist);

        // UC5: Ordered & Unique Formation (LinkedHashSet)
        // Maintains the sequence while preventing duplicates
        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // Duplicate - ignored

        System.out.println("Final Train Formation (Ordered & Unique): " + formation);
    }
}