public class Excercise04Power  {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    int n = 2;
    int base = 4;

    System.out.println(compute(n,base));
  }
  public static int compute(int n, int base){
    if(n==1){
      return base;
    }else{
      int powerN;
      powerN = base * compute(n-1,base);
      return powerN;
    }
  }
}
