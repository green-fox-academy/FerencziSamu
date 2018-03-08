import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  Apples apple = new Apples();

  @Test
  public void getAppleTest() {
    //assertTrue("Apple",true);
    assertEquals("Apple",apple.getApple());
  }
}