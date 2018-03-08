import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> numbers = new ArrayList<>();

  public int Sum(List<Integer> list) {
    int sumOfNumbers = 0;
    for (int i = 0; i < list.size(); i++) {
      sumOfNumbers += list.get(i);
    }return sumOfNumbers;
  }
}
