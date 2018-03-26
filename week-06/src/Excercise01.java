import java.util.ArrayList;
import java.util.Arrays;

public class Excercise01 {
  // Write a Stream Expression to get the even numbers from the following array:

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    numbers.stream()
        .filter(n -> n % 2 != 1 && n % 2 != -1)
        .forEach(System.out::println);
    System.out.println();
  // Write a Stream Expression to get the average value of the odd numbers from the following array:

    numbers.stream()
        .filter(n -> n % 2 = 1)
        .
  }
}
