// import java.util.Dictionary;  hashmap ide tartozik, legnagyobb
// Hashmapben van-e --> containsKey

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public Map<Character, Integer> dictionaryOfalphabets(String word) {
    Map<Character, Integer> countsDictionaryOfAlphabets = new HashMap<>();
    char[] arrayOfChars = word.toCharArray();
    char character;
    for (int i = 0; i < word.length(); i++) {
      character = arrayOfChars[i];
      if (countsDictionaryOfAlphabets.containsKey(character)) {
        countsDictionaryOfAlphabets.put(character, countsDictionaryOfAlphabets.get(character) + 1);
      } else {
        countsDictionaryOfAlphabets.put(character, 1);
      }
    }
    return countsDictionaryOfAlphabets;
  }

}

