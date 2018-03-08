import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters letters = new CountLetters();

  @Test
  public void dictionaryOfalphabetsTest() {
    String text = "Hello darkness my old friend!";
    assertEquals((Integer) 2, letters.dictionaryOfalphabets(text).get('s'));
  }
}