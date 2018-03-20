import java.util.ArrayList;
import java.util.List;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
   System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static List uniqueCharacters(String word) {
    List<Character> result = new ArrayList<>();
    List<Character> notUniqueCharList = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      if (!result.contains(word.charAt(i))) {
        result.add(word.charAt(i));
      } else {
        notUniqueCharList.add(word.charAt(i));
      }
    }
    for (int i = 0; i < notUniqueCharList.size(); i++) {
      result.remove(notUniqueCharList.get(i));
    }
    return result;
  }
}