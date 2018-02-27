/*import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Excercise07TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.
   ticTacResult();


    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }
// soronként olvasok, ArrayLista OOO, visszatérni o-val
  public static String ticTacResult(String file) {
     Path path1 = Paths.get(file);
     file = "win-x.txt";
     Files.readAllLines(file);

    try {

    }
  }
}
*/