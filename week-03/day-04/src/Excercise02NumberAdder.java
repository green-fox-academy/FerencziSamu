public class Excercise02NumberAdder {
  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
  public static void main(String[] args) {
    int n = 6;
    System.out.println(takesParameterAndAddsANumberToIt(n));

  }

  public static int takesParameterAndAddsANumberToIt(int n) {
    if (n == 1) {
      return 1;
    } else {
      int result;
      result = (n + takesParameterAndAddsANumberToIt(n - 1));
      return result;
    }
  }
}
