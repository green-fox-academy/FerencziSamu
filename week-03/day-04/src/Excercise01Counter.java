public class Excercise01Counter {
  // Write a recursive function that takes one parameter: n and counts down from n.

  public static void main(String[] args) {
    int n = 10;
    counter(n);


  }

  public static int counter(int n){
    if (n == 1) {
      return 1;
    } else {
      return counter(n - 1);
    }
  }
}