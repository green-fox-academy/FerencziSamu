public class Excercise05Bunnies {
  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
  public static void main(String[] args) {

    int ears = 2;
    int bunnies = 40;
    System.out.println(compute(ears,bunnies));
  }

  public static int compute(int ears, int bunnies) {
    if (bunnies == 1) {
      return ears;
    }else{
      return ears + compute(ears,bunnies-1);
    }
  }
}
