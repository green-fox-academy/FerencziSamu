// The crash-incidents.csv file contains data of road crash-incidents.
// (id; location; surface type; surface condition; light condition; weather condition; crash date; year)
// Your task will be to count how many crash-incidents happened at good/bad
// weather conditions.
// Good weather conditions are CLOUDY and CLEAR.
// Bad weather conditions are RAIN, FREEZING RAIN, SNOW, FOG and SEVERE CROSSWINDS.
// So create the necessary method(s) that returns with the amount of crash-incidents.
// And print the return value to the console:
// The amount of crashes at good weather conditions: {amount}
// The amount of crashes at bad weather conditions: {amount}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Crashes {
  public static void main(String[] args) {
    System.out.println(getGoodWeather());
  }

  public static String getGoodWeather() {
    Path filePath = Paths.get("src/crashes.txt");
    List<String> lines = null;
    int countOfGoodWeathers = 0;
    try {
      lines = Files.readAllLines(filePath);
//      System.out.println(lines.size());
      for (int i = 0; i < lines.size(); i++) {
        if (lines.get(i).contains("CLOUDY") || lines.get(i).contains("CLEAR")) {
          countOfGoodWeathers += 1;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "The amount of crashes at good weather conditions: " + countOfGoodWeathers + "\n" +
        "The amount of crashes at bad weather conditions: " + (lines.size() - countOfGoodWeathers);
  }
}