import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FavouriteAnimals {
  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them

    FavouriteAnimals favouriteAnimal1 = new FavouriteAnimals();
    if (args.length == 0) {
      favouriteAnimal1.printUsage();
    } else {
      for (int i = 0; i < args.length; i++) {
        favouriteAnimal1.writeIntoTheFile(args[i]);
      }
    }
  }

  public FavouriteAnimals() {

  }

  public void printUsage() {
    System.out.println("```java FavouriteAnimals [animal] [animal]```");
  }

  public void writeIntoTheFile(String animal) {
    Path path1 = Paths.get("favourites.txt");
    File file = new File("favourites.txt");
    try {
      if (!file.exists()) {
        file.createNewFile();
      }
      List<String> tartalom = Files.readAllLines(path1);
      if (!tartalom.contains(animal)) {
        tartalom.add(animal);
      }
      Files.write(path1, tartalom);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
