import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {
  UniqueChars uniqueChars1 = new UniqueChars();

  @Test
  public void UniqueCharTestForEmptyString() {
    String word1 = "";
    assertEquals(Arrays.asList(), uniqueChars1.uniqueCharacters(word1));
  }

  @Test
  public void OnlySingleCharacters() {
    String word2 = "elmak";
    assertEquals(Arrays.asList("e", "l", "m", "a", "k").toString(), uniqueChars1.uniqueCharacters
        (word2).toString());
  }

  @Test
  public void NotOnlySingleCharacters() {
    String word3 = "Ferike";
    assertEquals(Arrays.asList("F", "r", "i", "k").toString(), uniqueChars1.uniqueCharacters
        (word3).toString());
  }


}