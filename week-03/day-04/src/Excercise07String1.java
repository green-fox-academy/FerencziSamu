public class Excercise07String1 {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    String text = "axxearaersyaxxaa";

    System.out.println(charcChanger(text));
  }

  public static String charcChanger(String text) {
    if (!text.contains("x")) {
      return text;
    } else {
      return charcChanger(text.replaceFirst("x", "y"));
    }

  }
}

