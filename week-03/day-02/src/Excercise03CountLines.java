import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Excercise03CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    String pathString = "my-file.txt";
    System.out.println(countsLines(pathString));

  }

  private static int countsLines(String filename) {
    Path path1 = Paths.get(filename);
    try {
      //open the file
      //returns number of lines
      List<String> lines = Files.readAllLines(path1);
      return lines.size();
    } catch (IOException e) {
      return 0;
    }

  }
}