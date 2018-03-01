public class Excercise03SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    int n = 165352;
    System.out.println(sumOfItsDigits(n));
  }
  public static int sumOfItsDigits(int n){
    if(n==0){
      return 0;
    }else{
      int digitsSum;
      digitsSum = (n % 10 + sumOfItsDigits(n / 10));
      return digitsSum;
    }
  }
}
