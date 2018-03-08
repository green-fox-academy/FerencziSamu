import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  Sum summa = new Sum(); // Instantiate your class
  List<Integer> listOfNumbers = new ArrayList<>();

  @Test
  public void sumTest() {
    listOfNumbers.add(1);
    listOfNumbers.add(2);
    listOfNumbers.add(3);
    listOfNumbers.add(4);
    listOfNumbers.add(5);
    assertEquals(15,summa.Sum(listOfNumbers));
  }
}