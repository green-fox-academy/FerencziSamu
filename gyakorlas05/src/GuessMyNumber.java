import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    int lives = 5;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Range!");

    int range = scanner.nextInt();

    int numberOfComputer = (int) (Math.random() * range);
//    System.out.println(numberOfComputer);
    System.out.println("Enter a guess!");

    int guess = scanner.nextInt();

    while (guess != numberOfComputer && lives != 0) {
      if (guess > numberOfComputer) {
        lives--;
        if (lives == 0) {
          break;
        }
        System.out.println("Too high! You have " + lives + " lives left.");
        guess = scanner.nextInt();
      } else if (guess < numberOfComputer) {
        lives--;
        if (lives == 0) {
          break;
        }
        System.out.println("Too low! You have " + lives + " lives left.");
        guess = scanner.nextInt();
      }
    }
    if (guess == numberOfComputer) {
      System.out.println("Congratulations! You won!");
    } else {
      System.out.println("You have " + lives + " left.");
    }
  }
}
