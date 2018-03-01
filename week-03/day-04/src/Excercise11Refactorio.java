public class Excercise11Refactorio {
  // Create a recursive function called `refactorio`
  // that returns it's input's factorial
  public static void main(String[] args) {
    int n = 5;
    System.out.println(refactorio(n));
  }

  public static int refactorio(int n) {
    if (n == 1) {
      return n;
    } else {
      return n * refactorio(n - 1);
    }

  }
}
