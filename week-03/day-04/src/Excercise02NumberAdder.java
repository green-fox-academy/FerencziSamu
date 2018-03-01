public class Excercise02NumberAdder {
  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
  public static void main(String[] args) {


    int n = 6;
    System.out.println(parameterTaker(n));

  }
  public static int parameterTaker(int n){
    if(n==1){
      return 1;
    } else {
      int result;
      result = (n + parameterTaker(n-1));
      return result;
    }
  }
}
