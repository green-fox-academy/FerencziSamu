
public class Exccercise01DevideByZero {


  public static void main(String[] args) {


    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    int number = 0;
    div(number);

  }

  public static void div(int number) {
    try {
      System.out.println(10 / number);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}



