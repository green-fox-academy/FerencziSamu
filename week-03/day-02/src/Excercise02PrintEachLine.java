import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Excercise02PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"

    String pathString = "my-file.txt";
    Path path1 = Paths.get("my-file.txt");


    try {
      List<String> lines = Files.readAllLines(path1);
      for (int i = 0; i < lines.size(); i++)
        System.out.println(lines.get(i));
    } catch (IOException e) {
      System.out.println("Unable to read file:" + pathString);
    }

  }

}
