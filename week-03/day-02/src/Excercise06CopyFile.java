import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Excercise06CopyFile {
  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful
  public static void main(String[] args) {
    String myfile = "my-file2.txt";
    String myfile2 = "my-file3.txt";
    System.out.println(fileCopier(myfile, myfile2));

  }

  private static boolean fileCopier(String copyFrom, String copyTo) {
    try {
      Path location = Paths.get(copyFrom);
      Path location2 = Paths.get(copyTo);
      Files.copy(location, location2);
      return true;
    } catch (IOException e){
      return false;
    }
  }
}
