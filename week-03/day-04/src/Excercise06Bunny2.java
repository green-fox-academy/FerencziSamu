public class Excercise06Bunny2 {
  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
  // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
  // have 3 ears, because they each have a raised foot. Recursively return the
  // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
  public static void main(String[] args) {

    int ears = 2;
    int bunnies = 5;
    System.out.println(compute(ears, bunnies));
  }

  public static int compute(int ears, int bunnies) {
    if (bunnies == 1) {
      return ears;
    } else if (bunnies % 2 == 0){
      return ears + 1 + compute(ears, bunnies - 1);
    }else{
      return ears + compute(ears, bunnies - 1);
      }
  }
}