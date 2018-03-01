public class Excercise08String2 {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.
  public static void main(String[] args) {
    String text = "axxearaersyaxxaa";
    System.out.println(charcChanger(text));
  }

  public static String charcChanger(String text) {
    if (!text.contains("x")) {
      return text;
    } else {
      return charcChanger(text.replaceFirst("x", ""));
    }
  }
}
