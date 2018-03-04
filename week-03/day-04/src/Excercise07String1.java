public class Excercise07String1 {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    String text = "axxearaersyaxxaa";

    System.out.println(charcChanger(text));
  }

  /*
  public static String charcChanger(String text) {
    if (!text.contains("x")) {
      return text;
    } else {
      return charcChanger(text.replaceFirst("x", "y"));
    }

  }
}
 */
  public static String charcChanger(String text) {
    if (text.length() == 0) {
      return text;
    } else if (text.charAt(0) == 'x') {
      return "y" + charcChanger(text.substring(1));
    } else {
      return text.charAt(0) + charcChanger(text.substring(1));
    }
  }
}
