package Comparator;


public class Dominoes implements Comparable<Dominoes> {
  private final int[] values;

  public Dominoes(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Dominoes currentItem) {
    if (values[0] > currentItem.values[0]) {
      return 1;
    } else return -1;
  }
}
