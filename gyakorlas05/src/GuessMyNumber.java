import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Range!");

    int range = scanner.nextInt();

    int numberOfComputer = (int) (Math.random() * range);
//    System.out.println(numberOfComputer);
    System.out.println("Enter a guess!");


    int guess = scanner.nextInt();

    while (guess != numberOfComputer) {
      if (guess > numberOfComputer) {
        System.out.println("Too high! Guess again!");
        guess = scanner.nextInt();
      } else if (guess < numberOfComputer) {
        System.out.println("Too low! Guess again!");
        guess = scanner.nextInt();
      }
    }
    System.out.println("Congratulations! You won!");
  }
}
