import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC2 (existing logic - keep it)
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        passengerBogies.remove("AC Chair");

        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Passenger Bogies: " + passengerBogies);
        System.out.println("Does Sleeper exist? " + exists);

        // ================= UC3 START =================

        // Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);

        // ================= UC3 END =================
    }
}