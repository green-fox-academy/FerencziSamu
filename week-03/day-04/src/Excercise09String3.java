public class Excercise09String3 {
  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    String text = "axxearaersyaxxaa";

    System.out.println(charcChanger(text));
  }

  public static String charcChanger(String text) {
    if ((text.length() * 2) - 2 == 0 ) {
      return text;
    } else {
      return charcChanger(text.replaceFirst("x", "y"));
    }
  }
}
