public class Excercise09String3 {
  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    String text = "axxearxxaa";

    System.out.println(charcChanger(text));
  }

  public static String charcChanger(String text) {
    if (text.length() == 1) {
      return "" + text.charAt(0);
    } else {
      return text.charAt(0) + "*" + charcChanger(text.substring(1));
    }
  }
}
