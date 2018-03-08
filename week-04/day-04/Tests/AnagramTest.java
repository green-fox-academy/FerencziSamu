import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram anagram1 = new Anagram();

  @Test
  public void anagramTest() {
    String word1 = "macska";
    String word2 = "csakma";
    assertTrue(anagram1.anagram(word1,word2));
  }
}