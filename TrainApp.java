import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // ================= UC2 =================
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        passengerBogies.remove("AC Chair");

        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Passenger Bogies: " + passengerBogies);
        System.out.println("Does Sleeper exist? " + exists);

        // ================= UC3 =================
        Set<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate

        System.out.println("Unique Bogie IDs: " + bogieIDs);

        // ================= UC4 =================

        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        System.out.println("After Adding Pantry: " + trainConsist);

        // Remove first and last
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final Train Consist: " + trainConsist);
    }
}