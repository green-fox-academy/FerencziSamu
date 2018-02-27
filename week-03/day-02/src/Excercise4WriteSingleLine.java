import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Excercise4WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"


    String pathString = "my-file.txt";
    Path path1 = Paths.get("my-file.txt");


    try {
      // open file "my-file.txt"
      // add Ferenczi Samuel into it
      List<String> lines = new ArrayList<>();
      lines.add("Ferenczi Samuel");
      Files.write(path1, lines);
    } catch (IOException e) {
      System.out.println("Unable to read file:" + pathString);
    }
  }
}