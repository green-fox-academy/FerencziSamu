import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  Sum summa = new Sum(); // Instantiate your class
  List<Integer> listOfNumbers = new ArrayList<>();

  @Test
  public void sumTestAdd() {
    listOfNumbers.add(1);
    listOfNumbers.add(2);
    listOfNumbers.add(3);
    listOfNumbers.add(4);
    listOfNumbers.add(5);
    assertEquals(15,summa.Sum(listOfNumbers));
  }
  @Test
  public void sumTestEmptyList(){
    assertTrue(summa.Sum(listOfNumbers) == 0);
    //assertEquals(0,summa.Sum(listOfNumbers));
  }
  @Test
  public void sumTestOneElement(){
    listOfNumbers.add(5);
    assertEquals(5,summa.Sum(listOfNumbers));
  }
  @Test
  public void sumTestMultipleElements(){
    listOfNumbers.add(5);
    listOfNumbers.add(6);
    assertEquals(11,summa.Sum(listOfNumbers));
  }
  @Test (expected = NullPointerException.class)
  public void sumTestNull(){
    listOfNumbers.add(null);
    assertEquals(null,summa.Sum(listOfNumbers));
  }
}