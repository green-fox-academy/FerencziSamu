import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    int numberOfComputer = (int) Math.random() * 100;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a guess!");
    int guess = scanner.nextInt();

    if (guess > numberOfComputer) {
      System.out.println("Too high!");
    } else if (guess < numberOfComputer) {
      System.out.println("Too low!");
    } else {
      System.out.println("Congratulations! You won!");
    }
  }
}
