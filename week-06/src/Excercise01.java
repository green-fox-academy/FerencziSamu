import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Excercise01 {
  // Write a Stream Expression to get the even numbers from the following array:

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    numbers.stream()
        .filter(n -> n % 2 != 1 && n % 2 != -1)
        .forEach(System.out::println);
    System.out.println();
    // Write a Stream Expression to get the average value of the odd numbers from the following array:
    OptionalDouble number =
        numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(n -> n)
            .average();
    System.out.println(number);
    System.out.println();
    // Write a Stream Expression to get the squared value of the positive numbers from the following array:
    numbers.stream()
        .filter(n -> n > 0)
        .map(n -> n * n + " ")
        .collect(Collectors.toList())
        .forEach(System.out::print);
    System.out.println();
    System.out.println();
    // Write a Stream Expression to find which number squared value is more then 20 from the following array:
    ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    numbers1.stream()
        .mapToInt(n -> n)
        .filter(n -> (n * n) > 20)
        .forEach(System.out::println);
    System.out.println();
    // Write a Stream Expression to find the uppercase characters in a string!
    String string = "kabAdsdwesSdasS";
    string.chars().filter(c -> Character.isUpperCase(c))
        .forEach(c -> System.out.print((char)c));
    System.out.println();
    System.out.println();

    // Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON",
        "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    cities.stream()
        .filter(c -> c.startsWith("A") & c.endsWith("I"))
        .forEach(System.out::println);
    System.out.println();
    // Write a Stream Expression to find the frequency of characters in a given string!
    String string2 = "asdpepemaksdklasdmeasxxsssasdawdd";
    string2.chars()
        .mapToObj(c -> Character.toString((char)c))
        .collect(Collectors.groupingBy(v -> v, Collectors.counting()))
        .forEach((c,b) -> System.out.println (c + " = " + b ));
    // 
  }

}

