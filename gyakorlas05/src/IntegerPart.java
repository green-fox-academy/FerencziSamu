import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerPart {
  public static void main(String[] args) {
    //  Create a function that takes a number and a list of numbers as a parameter
    //  Returns the indeces of the numbers in the list where the first number is part of
    //  Returns an empty list if the number is not part any of the numbers in the list

    //  Example:

    System.out.println(fug(1, Arrays.asList(1, 11, 34, 52, 61)));
    //  should print: `[0, 1, 4]`
    System.out.println(fug(9, Arrays.asList(1, 11, 34, 52, 61)));
    //  should print: '[]'

  }

  public static List fug(Integer number, List<Integer> list) {
    List<Integer> listOfIndeces = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).toString().contains(number.toString())) {
        listOfIndeces.add(i);
      }
    }
    return listOfIndeces;
  }
}