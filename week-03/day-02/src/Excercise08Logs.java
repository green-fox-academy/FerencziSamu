import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Excercise08Logs {
  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP adresses.
  // Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {
    Path logFile = Paths.get("log.txt");
    try {
      List<String> lines = Files.readAllLines(logFile);
      uniqueIp(lines);

    } catch (IOException e) {

    }

  }

  private static void uniqueIp(List<String> rows) {
    ArrayList<String> lista = new ArrayList<>();
    for (int i = 0; i < rows.size(); i++) {
      lista.add(rows.get(i).substring(27, 38));
      System.out.println(lista.get(i));


    }
  }
}

