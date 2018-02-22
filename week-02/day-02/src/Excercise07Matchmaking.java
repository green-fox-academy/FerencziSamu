import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise07Matchmaking {

    public static void main(String... args) {
        List<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        List<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static List<String> makingMatches(List<String> listOfGirls, List<String> listOfBoys) {
        int position = 0;
        if (listOfBoys.size() > listOfGirls.size()) {
            for (int i = 0; i < listOfGirls.size(); i++) {
                listOfBoys.add(position, listOfGirls.get(i));
                position = position + 2;
            }

        }
        return listOfBoys;

    }
}
