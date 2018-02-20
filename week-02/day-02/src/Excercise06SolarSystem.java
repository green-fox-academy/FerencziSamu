import java.util.ArrayList;
import java.util.Arrays;
public class Excercise06SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        System.out.println(putSaturn(planetList));
    }
        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
    public static ArrayList<String> putSaturn(ArrayList<String> valami) {
        valami.add("Saturn");
        return valami;
    }
}
